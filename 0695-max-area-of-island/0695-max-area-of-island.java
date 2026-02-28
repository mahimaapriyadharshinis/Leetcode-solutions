class Solution {
    
    int check(int i, int j, int count, int[][] grid){
        
        // Correct boundary condition
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        
        // Mark visited
        grid[i][j] = 0;
        
        // Count current cell + 4 directions
        count = 1 
                + check(i+1, j, 0, grid)
                + check(i-1, j, 0, grid)
                + check(i, j+1, 0, grid)
                + check(i, j-1, 0, grid);
        
        return count;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int k = check(i, j, 0, grid);
                    max = Math.max(max, k);
                }
            }
        }
        
        return max;
    }
}