package recursion;

import java.util.ArrayList;
import java.util.List;

// Print the count of subsequences with sum K
public class Recursion_32 {
   private static int countSubsequenceWithSumK(int[] arr, int idx, int k, int sum){
    if(sum>k) return 0;
    if(idx >= arr.length){
        if(sum == k){
            return 1;
        }
        return 0;
    }
    int left = countSubsequenceWithSumK(arr, idx+1, k, sum+arr[idx]);
    int right = countSubsequenceWithSumK(arr, idx+1, k, sum);
    return left + right;
   }
   public static void main(String[] args){
    int[] arr = {3,2,2,1};
    System.out.println(countSubsequenceWithSumK(arr, 0, 5, 0));
   }

}
