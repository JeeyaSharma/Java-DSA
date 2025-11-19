package recursion;

import java.util.ArrayList;
import java.util.List;

// Leetcode 46 Permutations
// Approach-2
public class Recursion_48 {
    private static void permuteHelper(int[] arr, int idx,List<List<Integer>> ans){
        if(idx>=arr.length){
            List<Integer> res = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                res.add(arr[i]);
            }
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            permuteHelper(arr, idx+1, ans);
            swap(idx, i, arr);
        }
    }
    private static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        permuteHelper(arr, 0, ans);
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }
}
