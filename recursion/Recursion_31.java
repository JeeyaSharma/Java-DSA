package recursion;

import java.util.ArrayList;
import java.util.List;

// Print any one subsequence with sum K
public class Recursion_31 {
    private static boolean printSubsequenceWithSumK(int[] arr, int idx, int k, int sum, List<Integer> ans){
        if(idx >= arr.length){
            if(sum == k){
                System.out.println(ans);
                return true;
            }
            return false;
        }
        ans.add(arr[idx]);
        if(printSubsequenceWithSumK(arr, idx+1, k, sum+arr[idx], ans)){
            return true;
        }
        ans.remove(ans.size()-1);
        return printSubsequenceWithSumK(arr, idx+1, k, sum, ans);
        
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        printSubsequenceWithSumK(arr, 0, 3, 0, new ArrayList<>());
    }
}
