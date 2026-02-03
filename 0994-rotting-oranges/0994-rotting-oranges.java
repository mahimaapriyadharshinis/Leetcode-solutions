class Solution {
    public int orangesRotting(int[][] grid) {

        int r = grid.length;
        int c = grid[0].length;
        int time = 0;

        while (true) {
            boolean changed = false;
            int[][] temp = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    temp[i][j] = grid[i][j];
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {

                    if (grid[i][j] == 2) {

                        if (i > 0 && grid[i-1][j] == 1) {
                            temp[i-1][j] = 2;
                            changed = true;
                        }
                        if (i < r-1 && grid[i+1][j] == 1) {
                            temp[i+1][j] = 2;
                            changed = true;
                        }
                        if (j > 0 && grid[i][j-1] == 1) {
                            temp[i][j-1] = 2;
                            changed = true;
                        }
                        if (j < c-1 && grid[i][j+1] == 1) {
                            temp[i][j+1] = 2;
                            changed = true;
                        }
                    }
                }
            }

            if (!changed) break;

            grid = temp;
            time++;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) return -1;
            }
        }

        return time;
    }
}
