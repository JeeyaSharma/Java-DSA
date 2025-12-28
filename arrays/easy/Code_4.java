package arrays.easy;

import java.util.Arrays;

// Leetcode 26
public class Code_4 {
    private static int removeDuplicates(int[] arr){
        int left = 0;
        for(int right=1;right<arr.length;right++){
            if(arr[right]!=arr[left]){
                left++;
                arr[left] = arr[right];
            }
        }
        System.out.println(Arrays.toString(arr));
        return left+1;
    }
    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
