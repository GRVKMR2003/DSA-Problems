class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'&& !vis[i][j]){
                    count++;
                    dfs( grid,   vis,  i, j, n ,  m);
                }
            }
        }

        return count;

    }

    public void dfs(char[][] grid,  boolean vis[][], int i,int j,int n , int m){
         if(i<0||j<0||i>=n||j>=m||grid[i][j]=='0'||vis[i][j]){
            return;
         }
        vis[i][j]=true;
        dfs(grid,vis,i+1,j,n,m);
        dfs(grid,vis,i-1,j ,n,m);
        dfs(grid,vis,i,j+1,n,m);
        dfs(grid,vis,i,j-1,n,m);
    }
}