package arrays.easy;

import java.util.Arrays;

// rotate array to right by k places
// leetcode 189
public class Code_5 {
    private static int[] rotateByk(int[] arr,int k){
        int n = arr.length;
        k = k%n;

        reverse(arr, 0, n-1);
        reverse(arr,0,k-1);
        reverse(arr, k, n-1);

        return arr;
    }
    private static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotateByk(arr,3)));
    }
}
