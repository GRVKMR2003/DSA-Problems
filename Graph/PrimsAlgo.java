

// User function Template for Java

class pair{
    int node;
    int dist;
    public pair(int dist, int node){
        this.node=node;
        this.dist=dist;
    }
}

class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        PriorityQueue<pair> pq =new PriorityQueue<>((x,y)->(x.dist-y.dist));
        int vis[]=new int[V];
        
        int sum=0;
        pq.add(new pair(0,0));
        while(!pq.isEmpty()){
             pair current = pq.poll();
            int wt = current.dist;
            int node = current.node;
            
            
            
            if(vis[node]==1){
                continue;
            }
                vis[node]=1;
                sum+=wt;
                for(int[] i:adj.get(node)){
                    int adjNode = i[0];  
                int edgeWeight = i[1]; 
                if(vis[adjNode]==0){
                    pq.add(new pair(edgeWeight, adjNode));
                
                }
            }
        }
        
        return sum;
        
        
        
        
    }
}