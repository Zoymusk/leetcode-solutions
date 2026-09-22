class Solution {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        int[][] directions = {
        {-1,-1},{-1,0},{-1,1},
        {0,-1},        {0,1},
        {1,-1}, {1,0}, {1,1}
    };
    char opposite = (color == 'B') ? 'W' : 'B';
      for (int[] dir : directions) {
        int r = rMove + dir[0];
        int c = cMove + dir[1];
        int count = 0;
        while (r >= 0 && r < 8 && c >= 0 && c < 8 && board[r][c] == opposite) {
            r += dir[0];
            c += dir[1];
            count++;
        }
        if (count > 0 && r >= 0 && r < 8 && c >= 0 && c < 8 && board[r][c] == color) {
            return true;
       }
       }
    return false;
    }
}