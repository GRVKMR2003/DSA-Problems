
import java.util.*;
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q = new LinkedList<>();
        boolean vis[]= new boolean[V];
        ArrayList<Integer> ls = new ArrayList<>();
           vis[0]=true;
        q.add(0);
        while(!q.isEmpty()){
           int curr = q.poll();
           ls.add(curr);
           for(int i:adj.get(curr)){
               if(!vis[i]){
                  vis[i]=true;
                  q.add(i);
               }
           }
       } 
       
       return ls;
        
       
    }
       
}