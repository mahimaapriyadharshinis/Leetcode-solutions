class Solution {
    public int check(int i,int j,char[][] grid,int c){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return 0;
        }else{
            grid[i][j]='0';
            check(i+1,j,grid,c);
            check(i-1,j,grid,c);
            check(i,j+1,grid,c);
            check(i,j-1,grid,c);
            return 1;
        }
    }
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c=c+check(i,j,grid,c);
                }
            }
        }
        return c;
    }
}