class Solution {
    public int solution(int[][] grid,boolean[][] tracker,int x, int y){
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length){
            return 0;
        }

        if(grid[x][y] == 0 || tracker[x][y]){
            return 0;
        }
        tracker[x][y] = true;
        int count = 1;
        count+=solution(grid,tracker,x+1,y);
        count+=solution(grid,tracker,x,y+1);
        count+=solution(grid,tracker,x-1,y);
        count+=solution(grid,tracker,x,y-1);
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int totalCount = 0;
        boolean[][] tracker = new boolean[row][col];

        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){

                if(grid[i][j]==1 && !tracker[i][j]){
                    int count = solution(grid,tracker,i,j);
                    totalCount = Math.max(count,totalCount);
                }
            }
        }
        return totalCount;
    }

}