class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i []:prerequisites){
            adj.get(i[1]).add(i[0]);
        }

        return !isCycle(n, adj);
    }

    public boolean isCycle(int n, ArrayList<ArrayList<Integer>> adj){
        int ind[]= new int[n];
        for(int i=0;i<n;i++){
            for(int j:adj.get(i)){
                ind[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
           int x = q.poll();
           count++;
           for(int i:adj.get(x)){
           ind[i]--;
            if(ind[i]==0){
                q.add(i);
            }
           }
        }

        return count!=n;
    }
}