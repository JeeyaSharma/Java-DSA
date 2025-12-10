package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    private static void printPermutations(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        permutations(arr, 0, ans);
        System.out.println(ans);
    }
    private static void permutations(int[] arr, int idx, List<List<Integer>> ans){
        if(idx==arr.length){
            List<Integer> res = new ArrayList<Integer>();
            for(int i=0;i<arr.length;i++){
                res.add(arr[i]);
            }
            ans.add(new ArrayList<>(res));
        }
        for(int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            permutations(arr, idx+1, ans);
            swap(i, idx, arr);
        }
    }
    private static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printPermutations(arr);
    }
}
