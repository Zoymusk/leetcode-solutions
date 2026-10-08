class Solution {
    public int racecar(int target) {
        int[] dp = new int[target + 1];
        for (int t = 1; t <= target; t++) {
            int n = 32 - Integer.numberOfLeadingZeros(t);
            if ((1 << n) - 1 == t) {
                dp[t] = n;
                continue;
            }
            dp[t] = n + 1 + dp[(1 << n) - 1 - t];
            int prev = (1 << (n - 1)) - 1;
            for (int m = 0; m < n - 1; m++) {
                int distance = t - (1 << (n - 1)) + (1 << m);
                dp[t] = Math.min(
                    dp[t],
                    (n - 1) + 1 + m + 1 + dp[distance]
                );
            }
        }
        return dp[target];
    }
}