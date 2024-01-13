class coinChange {

    public int coinChangeProblem(int[] coins, int amount) {
        int m = coins.length;
        int n = amount;
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 0;
        for (int j = 1; j <= n; j++) {
            // We can take Integer.MAX_VALUE and subtract some value to avoid integer
            // overflow
            dp[0][j] = Integer.MAX_VALUE - 10;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < coins[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                }
            }
        }

        if (dp[m][n] >= Integer.MAX_VALUE - 10)
            return -1;
        return dp[m][n];
    }
}

/*
 * Recursive solution - Gives TLE
 * 
 * private int helper(int[] coins, int amt, int idx, int coinsUsed){
 * if(idx == coins.length || amt <= 0) {
 * if(amt == 0)
 * return coinsUsed;
 * 
 * return Integer.MAX_VALUE;
 * }
 * 
 * int left = helper(coins,amt-coins[idx],idx,coinsUsed+1);
 * int right = helper(coins,amt,idx+1,coinsUsed);
 * return Math.min(left,right);
 * }
 * 
 * public int coinChange(int[] coins, int amount) {
 * return helper(coins, amount, 0,0) == Integer.MAX_VALUE ? -1 : helper(coins,
 * amount, 0,0);
 * }
 */