class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n * n + 1];

        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }

        int repeated = 0;
        int missing = 0;

        for (int i = 1; i <= n * n; i++) {
            if (freq[i] == 2) {
                repeated = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }
        return new int[]{repeated, missing};
    }
}