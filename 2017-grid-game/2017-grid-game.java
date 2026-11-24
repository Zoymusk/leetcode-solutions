class Solution {
    public long gridGame(int[][] grid) {
        long topSum = 0;
        long bottomSum = 0;

        for (int num : grid[0]) {
            topSum += num;
        }

        long result = Long.MAX_VALUE;

        for (int i = 0; i < grid[0].length; i++) {
            topSum -= grid[0][i];

            result = Math.min(result, Math.max(topSum, bottomSum));

            bottomSum += grid[1][i];
        }
        return result;
    }
}