package recursion;

import java.util.ArrayList;
import java.util.List;

// Leetcode-39 Combination Sum
public class Recursion_41 {
    static List<List<Integer>> ans = new ArrayList<>();
    private static List<List<Integer>> combinationSum(int[] arr, int target){
        helper(arr,target,0,0,new ArrayList<>());
        return ans;
    }
    private static void helper(int[] arr, int target, int idx, int sum, List<Integer> res){
        if(idx>=arr.length){
            if(sum==target){
                ans.add(new ArrayList<>(res));
            }
            return;
        }
        if(sum>target) return;
        res.add(arr[idx]);
        helper(arr, target, idx, sum+arr[idx], res);
        res.remove(res.size()-1);
        helper(arr, target, idx+1, sum, res);
    }
    public static void main(String[] ans){
        int[] arr = {2,3,6,7};
        System.out.println(combinationSum(arr, 7));
    }
    
}
