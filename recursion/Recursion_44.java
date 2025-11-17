package recursion;

import java.util.ArrayList;
import java.util.List;

// Leetcode 377 Combination Sum 4
public class Recursion_44 {
    private static List<List<Integer>> combinationSum4(int[] nums, int target){
        return helper(nums,target,0,new ArrayList<>());
    }
    private static List<List<Integer>> helper(int[] arr, int target, int idx, List<Integer> res){
        List<List<Integer>> ans = new ArrayList<>();
        if(idx>=arr.length){
            if(target==0){
            ans.add(new ArrayList<>(res));
        }
        return ans;}
        res.add(arr[idx]);
        ans.addAll(helper(arr,target-arr[idx],idx,res));
        res.remove(res.size()-1);
        ans.addAll(helper(arr,target,idx+1,res));
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(combinationSum4(arr, 4));
    }
}
