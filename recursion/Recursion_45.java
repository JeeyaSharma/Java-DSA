package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find subsets of an array using recursion
public class Recursion_45 {
    private static List<List<Integer>> findSubsets(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr, 0, new ArrayList<>(), ans);
        return ans;
    }
    private static void helper(int[] arr, int idx, List<Integer> res, List<List<Integer>> ans){
        ans.add(new ArrayList<>(res));
        
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            res.add(arr[i]);
            helper(arr, i+1, res, ans);
            res.remove(res.size()-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,3};
        System.out.println(findSubsets(arr));
    }
}
