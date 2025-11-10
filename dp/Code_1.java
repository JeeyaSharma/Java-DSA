package dp;

import java.util.Arrays;

public class Code_1 {
    private static int fibo(int n, int[] dp){
        if(n == 0 || n == 1){
            if(dp[n]!= -1){
                return dp[n];
            }
            dp[n] = n;
            return dp[n];
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int a = fibo(n-1, dp);
        int b = fibo(n-2, dp);
        dp[n] = a+b;
        return dp[n];
    }
    public static void main(String[] args){
        int n = 6;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n, dp));
    }
}
