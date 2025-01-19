<<<<<<< HEAD
import java.util.*;

class pair{
    int f;
    int s;
    pair(int f,int s){
        this.f=f;
        this.s=s;
    }
}

class Solution
{
  
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> a.f - b.f);
        
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE); 
        
        dist[S] = 0; 
        pq.add(new pair(0, S)); 
        
        while (!pq.isEmpty()) {
            pair curr = pq.poll();
            int currDist = curr.f; 
            int node = curr.s;    
            
            for (ArrayList<Integer> neighbor : adj.get(node)) {
                int adjNode = neighbor.get(0);  
                int edgeWeight = neighbor.get(1); 
                
                if (currDist + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = currDist + edgeWeight; 
                    pq.add(new pair(dist[adjNode], adjNode)); 
                }
            }
        }
        
        return dist;
    }
=======
import java.util.*;

class pair{
    int f;
    int s;
    pair(int f,int s){
        this.f=f;
        this.s=s;
    }
}

class Solution
{
  
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> a.f - b.f);
        
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE); 
        
        dist[S] = 0; 
        pq.add(new pair(0, S)); 
        
        while (!pq.isEmpty()) {
            pair curr = pq.poll();
            int currDist = curr.f; 
            int node = curr.s;    
            
            for (ArrayList<Integer> neighbor : adj.get(node)) {
                int adjNode = neighbor.get(0);  
                int edgeWeight = neighbor.get(1); 
                
                if (currDist + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = currDist + edgeWeight; 
                    pq.add(new pair(dist[adjNode], adjNode)); 
                }
            }
        }
        
        return dist;
    }
>>>>>>> 184c048101027d87f3a7986bec0e4cb0bdc01456
}