class Solution {
    public boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<graph.length;i++){
            for(int j:graph[i]){
                adj.get(i).add(j);
            }
        }

        int col[]= new int[graph.length];

        Arrays.fill(col,-1);
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                if(!bfs(col,adj,i)) return false;
            }
        }

        return true;

    }

    public boolean bfs(int col[], ArrayList<ArrayList<Integer>> adj,int s ){
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        col[s]=0;
        while(!q.isEmpty()){
         int x = q.poll();
         
         for(int i:adj.get(x)){
            if(col[i]==-1){
                col[i]=1-col[x];
                q.offer(i);
            }else if(col[i]==col[x]){
                return false;
            }
         }
        }

        return true;
    }
}