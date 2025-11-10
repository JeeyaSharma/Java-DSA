package recursion;

import java.util.ArrayList;
import java.util.List;

// Print all Sunsequences with sum K
public class Recursion_30 {
    private static void printSubsequenceWithSumK(int[] arr, int idx, int k, int sum, List<Integer> ans){
        if(idx >= arr.length){
            if(sum == k){
                System.out.println(ans);
            }
            return;
        }
        ans.add(arr[idx]);
        printSubsequenceWithSumK(arr, idx+1, k, sum+arr[idx], ans);
        ans.remove(ans.size()-1);
        printSubsequenceWithSumK(arr, idx+1, k, sum, ans);
    }
    public static void main(String[] args){
        int[] arr = {3,2,2,1};
        printSubsequenceWithSumK(arr, 0, 4, 0, new ArrayList<>());
    }
}
