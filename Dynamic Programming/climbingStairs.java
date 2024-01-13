import java.util.Arrays;

class climbingStairs {

    int res = 0;

    public int helper(int n, int[] dp) {

        if (n == 0)
            return dp[0];
        if (n == 1)
            return dp[1];

        if (dp[n] != -1)
            return dp[n];

        dp[n - 1] = helper(n - 1, dp);
        dp[n - 2] = helper(n - 2, dp);
        dp[n] = dp[n - 1] + dp[n - 2];

        return dp[n];

        // For loop based recursion gives TLE

        // if(n <= 0) {
        // if(n == 0) {
        // res++;
        // }
        // return;
        // }

        // for(int i=1;i<=2;i++) {
        // helper(n-i);
        // }

    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;

        return helper(n, dp);
    }
}