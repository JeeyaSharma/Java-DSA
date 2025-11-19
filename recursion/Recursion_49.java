package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// Leetcode 47 Permutations 2
public class Recursion_49 {
    private static void permuteHelper(int[] arr, int idx, List<List<Integer>> ans){
        if(idx>=arr.length){
            List<Integer> res = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                res.add(arr[i]);
            }
            ans.add(new ArrayList<>(res));
            return;
        }

        HashSet<Integer> used = new HashSet<>();

        for(int i=idx;i<arr.length;i++){
            if(used.contains(arr[i])) continue;

            used.add(arr[i]);
            swap(idx, i, arr);
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
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        permuteHelper(arr, 0, ans);
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,3,2};
        System.out.println(permute(arr));
    }
}
