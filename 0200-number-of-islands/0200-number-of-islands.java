class Solution {
    // public int numIslands(char[][] grid) {
    //     int row = grid.length;
    //     int col = grid[0].length;
    //     int count=0;
    //     boolean[][] tracker = new boolean[row][col];

    //     for(int i = 0; i<row; i++){
    //         for(int j =0; j<col; j++){

    //             if(grid[i][j]=='1' && !tracker[i][j]){
    //                 count++;
    //                 solution(grid,tracker,i,j);
    //             }
    //         }
    //     }
    //     return count;
    // }

    // public void solution(char[][] grid,boolean[][] tracker,int x, int y){
        
    //     if(x<0 || x>=grid.length || y<0 || y>=grid[0].length){
    //         return;
    //     }

    //     if(grid[x][y] == '0' || tracker[x][y]){
    //         return;
    //     }
    //     tracker[x][y] = true;
        
    //     solution(grid,tracker,x+1,y);
    //     solution(grid,tracker,x,y+1);
    //     solution(grid,tracker,x-1,y);
    //     solution(grid,tracker,x,y-1);
        
    // }

    public void dfs(char[][]grid,int i,int j,int n,int m) {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0'){
            return ;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j-1,n,m);
        dfs(grid,i,j+1,n,m);
    }
    public int numIslands(char[][] grid) {
        int n  = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j]=='1') {
                    dfs(grid,i,j,n,m);
                    count++;
                }
            }
        }
        return count;
    }
}