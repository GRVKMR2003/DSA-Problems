import java.util.*;

class Solution
{
    private boolean dfs(int node, int col, int color[], 
    ArrayList<ArrayList<Integer>>adj) {
        
        color[node] = col; 
        
        for(int it : adj.get(node)) {
            if(color[it] == -1) {
                if(dfs(it, 1 - col, color, adj) == false) return false; 
            }
            else if(color[it] == col) {
                return false; 
            }
        }
        
        return true; 
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int color[] = new int[V];
	    for(int i = 0;i<V;i++) color[i] = -1; 
	    
	    // for connected components
	    for(int i = 0;i<V;i++) {
	        if(color[i] == -1) {
	            if(dfs(i, 0, color, adj) == false) return false; 
	        }
	    }
	    return true; 
    }
     public static void main(String[] args)
    {
        // V = 4, E = 4
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        Solution obj = new Solution();
        boolean ans = obj.isBipartite(4, adj);
        if(ans)
            System.out.println("1");
        else System.out.println("0");
    }

}