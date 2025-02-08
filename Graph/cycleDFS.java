class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        int visited[]= new int[n];
        int visiting[]= new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            
        }

        for(int i[]:prerequisites){
            adj.get(i[1]).add(i[0]);
        }
        for(int i=0;i<n;i++){
            if(visited[i]==0){

            if(hascyc(adj, visited,visiting ,i)){
                return false;
            }
            }
        }

        return true;

    }

    public boolean hascyc( ArrayList<ArrayList<Integer>> adj,int visited[], int visiting[], int s ){
        if(visiting[s]==1){
            return true;
        }

        if(visited[s]==1){
            return false;
        }
      visiting[s]=1;
        for(int i:adj.get(s)){
            
                if(hascyc(adj,visited, visiting , i)){
                    return true;
                }

                
            
        }
        visiting[s]=0;
                visited[s]=1;

        return false;
    }
}