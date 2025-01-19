import java.util.*;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n = adj.size();
        boolean vis[] = new boolean[n];
        ArrayList<Integer> result = new ArrayList<>();
        dfs(0,result , vis,adj);
        return result;
        
    }
    
    
    public void dfs(int s , ArrayList<Integer> result, boolean vis[], ArrayList<ArrayList<Integer>> adj){
        
        vis[s]=true;
                result.add(s);
        for(int i:adj.get(s)){
            if(!vis[i]){
            dfs(i,result,vis,adj);
            }
        }
    }
}