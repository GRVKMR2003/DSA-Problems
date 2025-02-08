class Solution {
    public boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }

        int col[] = new int[graph.length];
        Arrays.fill(col,-1);
       for(int i=0;i<graph.length;i++){
        if(col[i]==-1){

        if(!dfs(adj,col,i,0)){
            return false;
        }
        }
       }

       return true;
    }

    public boolean dfs(ArrayList<ArrayList<Integer>> adj ,int col[], int s, int c ){
      col[s]=c;

      for(int i:adj.get(s)){
        if(col[i]==-1){

            if(!dfs(adj,col,i,1-c)){
                return false;
            }
            
        }else if(col[i]==col[s]){
            return false;
        }
      }

      return true;


    }
}