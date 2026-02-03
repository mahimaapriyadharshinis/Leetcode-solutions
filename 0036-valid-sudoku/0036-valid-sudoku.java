class Solution {

    public boolean isvalidrow(char[][] board, int i1, int j1) {
        char x = board[i1][j1];
        if (x == '.') return true;

        for (int j = 0; j < 9; j++) {
            if (j != j1 && board[i1][j] == x) {
                return false;
            }
        }
        return true;
    }

    public boolean isvalidcol(char[][] board, int i1, int j1) {
        char x = board[i1][j1];
        if (x == '.') return true;

        for (int i = 0; i < 9; i++) {
            if (i != i1 && board[i][j1] == x) {
                return false;
            }
        }
        return true;
    }

    public boolean isvalidrowcol(char[][] board, int x, int y) {
        char val = board[x][y];
        if (val == '.') return true;

        int sr = (x / 3) * 3;
        int sc = (y / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if ((i != x || j != y) && board[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                boolean x = isvalidrow(board, i, j);
                boolean y = isvalidcol(board, i, j);
                boolean z = isvalidrowcol(board, i, j);

                if (!(x && y && z)) {
                    return false;
                }
            }
        }
        return true;
    }
}
