package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode-40 Combination Sum 2
public class Recursion_42 {
    private static List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        return helper(candidates, target, 0, new ArrayList<>());
    }
    private static List<List<Integer>> helper(int[] arr, int target, int idx, List<Integer> res){
        List<List<Integer>> ans = new ArrayList<>();
        if(target==0){
            ans.add(new ArrayList<>(res));
            return ans;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            res.add(arr[i]);
            ans.addAll(helper(arr, target-arr[i], i+1, res));
            res.remove(res.size()-1);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {2,5,2,1,2};
        System.out.println(combinationSum2(arr, 5));
    }
}
