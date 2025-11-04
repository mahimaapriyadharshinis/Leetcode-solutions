class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] m = new int[r][c];

        // 1. Transpose
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = matrix[j][i];
            }
        }

        // 2. Reverse each row
        for (int i = 0; i < r; i++) {
            for (int j = 0, k = c - 1; j < k; j++, k--) {
                int temp = m[i][j];
                m[i][j] = m[i][k];
                m[i][k] = temp;
            }
        }

        // 3. Copy back to original matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = m[i][j];
            }
        }
    }
}
