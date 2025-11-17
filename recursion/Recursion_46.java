package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given an array nums of n integers. Return array of sum of all subsets of the array nums.

Output can be returned in any order.
Examples:
Input : nums = [2, 3]
Output : [0, 2, 3, 5]

Explanation :
When no elements is taken then Sum = 0.
When only 2 is taken then Sum = 2.
When only 3 is taken then Sum = 3.
When element 2 and 3 are taken then sum = 2+3 = 5.

Input : nums = [5, 2, 1]
Output : [0, 1, 2, 3, 5, 6, 7, 8]

Explanation :
When no elements is taken then Sum = 0.
When only 5 is taken then Sum = 5.
When only 2 is taken then Sum = 2.
When only 1 is taken then Sum = 1.
When element 2 and 1 are taken then sum = 2+1 = 3.
 */
public class Recursion_46 {
    private static List<Integer> subsetSum(int[] arr){
        List<Integer> ans = new ArrayList<>();
        helper(arr, 0, 0, ans);
        Collections.sort(ans);
        return ans;
    }
    private static void helper(int[] arr, int idx, int sum, List<Integer> ans){
        if(idx >= arr.length){
            ans.add(sum);
            return;
        }
        helper(arr, idx+1, sum+arr[idx], ans);
        helper(arr, idx+1, sum, ans);

    }
    public static void main(String[] args){
        int[] arr = {3,1,2};
        System.out.println(subsetSum(arr));
    }
}
