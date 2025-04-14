class Solution {
    public int findCircleNum(int[][] c) {
        int n = c.length;
        int x=0;
        int vis[] = new int[n];
        Arrays.fill(vis,0);

        for(int i=0;i<n;i++){
             if(vis[i]==0){
                x++;
                dfs(vis , c ,0);
             }
        }

        return x;
    }


    public void dfs(int vis[] , int c[][] , int n){
        if(vis[n]==0){
            vis[n]=1;
        }

        for(int i= 0;i<c.length;i++){
            if(vis[i]==0 && c[n][i]==1 ){
                dfs(vis, c ,i);
            }
        }
    }
}