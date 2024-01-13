import java.util.Arrays;

public class fibonacciDP {
    public static int fibo(int n, int[] dp) {

        /*
         * Memoization solution
         * if (n <= 1)
         * return n;
         * 
         * if (dp[n] != -1)
         * return dp[n];
         * 
         * dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
         * return dp[n];
         */

        /*
         * Tabulation solution extra space
         * if (n <= 1)
         * return dp[n];
         * 
         * for (int i = 2; i <= n; i++) {
         * dp[i] = dp[i - 1] + dp[i - 2];
         * }
         * 
         * return dp[n];
         */

        int prev2 = 0;
        int prev = 1;

        if (n == 0)
            return prev2;
        if (n == 1)
            return prev;

        int res = prev + prev2;

        for (int i = 2; i < n; i++) {
            prev2 = prev;
            prev = res;
            res = prev + prev2;
        }
        return res;

    }

    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(fibo(n, dp));
    }
}
