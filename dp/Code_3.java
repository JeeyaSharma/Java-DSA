package dp;

// Leetcode-416
public class Code_3 {
    public static boolean canPartition(int[] nums){
        int total = 0;
        for(int n:nums){
            total+=n;
        }
        return helper(nums, total, 0, 0);
    }
    private static boolean helper(int[] arr, int target, int sum, int idx){
        if(idx>=arr.length){
            if(target == sum){
                return true;
            }
            return false;
        }
        if(target == sum) return true;

        boolean notInclude = helper(arr, target, sum, idx+1);
        boolean include = false;
        if(target>arr[idx]){
            include = helper(arr, target-arr[idx], sum+arr[idx], idx+1);
        }
        return include || notInclude;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(canPartition(arr));
    }
}
