package recursion;

import java.util.ArrayList;
import java.util.List;

// Leetcode 46, Find permutations of an array
// Approach-1
public class Recursion_47 {
    private static void helper(int[] arr, boolean[] freq, List<Integer> res, List<List<Integer>> ans){
        if(res.size()==arr.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]==true){
                freq[i]=true;
                res.add(arr[i]);
                helper(arr, freq, res, ans);
                res.remove(res.size()-1);
                freq[i]=false;
            }
        }
    }
    private static List<List<Integer>> findPermutations(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr, new boolean[arr.length], new ArrayList<>(), ans);
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(findPermutations(arr));
    }
}
