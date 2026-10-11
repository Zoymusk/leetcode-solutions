class Solution {
    public boolean placeWordInCrossword(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (check(board, word, i, j, 0, 1) ||
                    check(board, word, i, j, 0, -1) ||
                    check(board, word, i, j, 1, 0) ||
                    check(board, word, i, j, -1, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean check(char[][] board, String word,
                          int r, int c, int dr, int dc) {
        int m = board.length;
        int n = board[0].length;
        int len = word.length();

        int pr = r - dr;
        int pc = c - dc;

        if (pr >= 0 && pr < m && pc >= 0 && pc < n
                && board[pr][pc] != '#') {
            return false;
        }

        for (int k = 0; k < len; k++) {
            int nr = r + k * dr;
            int nc = c + k * dc;

            if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                return false;
            }

            if (board[nr][nc] == '#') {
                return false;
            }

            if (board[nr][nc] != ' ' &&
                board[nr][nc] != word.charAt(k)) {
                return false;
            }
        }

        int er = r + len * dr;
        int ec = c + len * dc;

        if (er >= 0 && er < m && ec >= 0 && ec < n
                && board[er][ec] != '#') {
            return false;
        }
        return true;
    }
}