import java.util.Arrays;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        int[][] rows = new int[n][n];
        int[][] cols = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rows[i][j] = grid[i][j];
                cols[j][i] = grid[i][j];
            }
        }

        int c = 0;

        
        for (int[] r : rows) {
            for (int[] col : cols) {
                if (Arrays.equals(r, col)) {  
                    c++;
                }
            }
        }

        return c;
    }
}
