package recursion;

import java.util.ArrayList;
import java.util.List;

// Leetcode-39 Combination Sum
public class Recursion_41 {
    // static List<List<Integer>> ans = new ArrayList<>();
    // private static List<List<Integer>> combinationSum(int[] arr, int target){
    //     helper(arr,target,0,0,new ArrayList<>());
    //     return ans;
    // }
    // private static void helper(int[] arr, int target, int idx, int sum, List<Integer> res){
    //     if(idx>=arr.length){
    //         if(sum==target){
    //             ans.add(new ArrayList<>(res));
    //         }
    //         return;
    //     }
    //     if(sum>target) return;
    //     res.add(arr[idx]);
    //     helper(arr, target, idx, sum+arr[idx], res);
    //     res.remove(res.size()-1);
    //     helper(arr, target, idx+1, sum, res);
    // }
    private static List<List<Integer>> combinationSum(int[] arr, int target){
        return helper(arr,target,0,new ArrayList<>());
    }
    private static List<List<Integer>> helper(int[] arr, int target, int idx, List<Integer> res){
        List<List<Integer>> ans = new ArrayList<>();
        if(idx>=arr.length){
            if(target==0){
                ans.add(new ArrayList<>(res));
            }
            return ans;
        }
        if(target<0) return ans;
        res.add(arr[idx]);
        ans.addAll(helper(arr, target-arr[idx], idx, res));
        res.remove(res.size()-1);
        ans.addAll(helper(arr, target, idx+1, res));
        return ans;
    }
    public static void main(String[] ans){
        int[] arr = {2,3,5};
        System.out.println(combinationSum(arr, 8));
    }
    
}
