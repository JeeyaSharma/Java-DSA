package recursion;

import java.util.ArrayList;
import java.util.List;

// Find subsets of an array using recursion
public class Recursion_45 {
    private static List<List<Integer>> findSubsets(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr, 0, new ArrayList<>(), ans);
        return ans;
    }
    private static void helper(int[] arr, int idx, List<Integer> res, List<List<Integer>> ans){
        if(idx >= arr.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(arr[idx]);
        helper(arr, idx+1, res, ans);
        res.remove(res.size()-1);
        helper(arr, idx+1, res, ans);
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,3};
        System.out.println(findSubsets(arr));
    }
}
