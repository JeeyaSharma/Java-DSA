package recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion_29 {
    private static void printSubsequence(int[] arr, int idx, List<Integer> ans){
        if(idx >= arr.length){
            System.out.println(ans);
            return;
        }
        ans.add(arr[idx]);
        printSubsequence(arr, idx+1, ans);
        ans.remove(ans.size()-1);
        printSubsequence(arr, idx+1, ans);
    }
    public static void main(String[] args){
        int[] arr = {3,1,2};
        printSubsequence(arr, 0, new ArrayList<>());
    }
}
