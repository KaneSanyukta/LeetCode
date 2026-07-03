class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count=0;
        boolean[][] tracker = new boolean[row][col];

        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){

                if(grid[i][j]=='1' && !tracker[i][j]){
                    count++;
                    solution(grid,tracker,i,j);
                }
            }
        }
        return count;
    }

    public void solution(char[][] grid,boolean[][] tracker,int x, int y){
        
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length){
            return;
        }

        if(grid[x][y] == '0' || tracker[x][y] == true){
            return;
        }
        tracker[x][y] = true;
        
        solution(grid,tracker,x+1,y);
        solution(grid,tracker,x,y+1);
        solution(grid,tracker,x-1,y);
        solution(grid,tracker,x,y-1);
        
    }
}