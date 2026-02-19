class Solution {

    public void check(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;

        check(i + 1, j, grid);
        check(i - 1, j, grid);
        check(i, j + 1, grid);
        check(i, j - 1, grid);
    }

    public int numEnclaves(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        for (int i = 0; i < r; i++) {
            if (grid[i][0] == 1) check(i, 0, grid);
            if (grid[i][c - 1] == 1) check(i, c - 1, grid);
        }

        for (int j = 0; j < c; j++) {
            if (grid[0][j] == 1) check(0, j, grid);
            if (grid[r - 1][j] == 1) check(r - 1, j, grid);
        }

        int num = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    num++;
                }
            }
        }

        return num;
    }
}