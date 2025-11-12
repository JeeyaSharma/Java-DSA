package dp;
// Leetcode 322
public class Code_2 {
    private static int coinChange(int[] coins, int amount, int idx){
        if(amount == 0) return 0;
        if(idx >= coins.length) return 100000;
        int taken = 100000;
        if(amount >= coins[idx]){
            taken = 1 + coinChange(coins, amount-coins[idx], idx);
        }
        int notTaken = 0 + coinChange(coins, amount, idx+1);

        return Math.min(taken, notTaken);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int target = 11;
        int ans = coinChange(arr, target, 0);
        System.out.println(ans);
    }
}
