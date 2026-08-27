class Solution {

    int[][] dp;

    public int superEggDrop(int k, int n) {

        dp = new int[k + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(k, n);
    }

    public int solve(int k, int n) {

        if (n == 0 || n == 1)
            return n;

        if (k == 1)
            return n;

        if (dp[k][n] != -1)
            return dp[k][n];

        int ans = Integer.MAX_VALUE;

        int low = 1;
        int high = n;

        while (low <= high) {

            int i = low + (high - low) / 2;

            int breaks = solve(k - 1, i - 1);
            int notBreak = solve(k, n - i);

            int attempts = 1 + Math.max(breaks, notBreak);

            ans = Math.min(ans, attempts);

            /*
             * breaks increases as i increases
             * notBreak decreases as i increases
             */

            if (breaks < notBreak) {
                // Need to go higher
                low = i + 1;
            } else {
                // Need to go lower
                high = i - 1;
            }
        }

        return dp[k][n] = ans;
    }
}