<<<<<<< HEAD


// User function Template for Java

/*
*   edges: vector of vectors which represents the graph
*   S: source vertex to start traversing graph with
*   V: number of vertices
*/class Solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int dist[] = new int[V]; 
        
        for(int i = 0; i < V; i++) {
            dist[i] = (int)1e8;
        }
        dist[S] = 0;  
        
        for(int i = 0; i < V-1; i++) {
            for(ArrayList<Integer> edge : edges) {
                int u = edge.get(0); 
                int v = edge.get(1); 
                int weight = edge.get(2); 
                
                if(dist[u] != (int)1e8 && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }
        
        for(ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int weight = edge.get(2);
            
            if(dist[u] !=(int)1e8 && dist[u] + weight < dist[v]) {
                return new int[] {-1};  
            }
        }
        
        return dist;  
    }
=======


// User function Template for Java

/*
*   edges: vector of vectors which represents the graph
*   S: source vertex to start traversing graph with
*   V: number of vertices
*/class Solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int dist[] = new int[V]; 
        
        for(int i = 0; i < V; i++) {
            dist[i] = (int)1e8;
        }
        dist[S] = 0;  
        
        for(int i = 0; i < V-1; i++) {
            for(ArrayList<Integer> edge : edges) {
                int u = edge.get(0); 
                int v = edge.get(1); 
                int weight = edge.get(2); 
                
                if(dist[u] != (int)1e8 && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }
        
        for(ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int weight = edge.get(2);
            
            if(dist[u] !=(int)1e8 && dist[u] + weight < dist[v]) {
                return new int[] {-1};  
            }
        }
        
        return dist;  
    }
>>>>>>> 184c048101027d87f3a7986bec0e4cb0bdc01456
}