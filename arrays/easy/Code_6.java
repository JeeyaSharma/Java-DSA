package arrays.easy;

import java.util.Arrays;
// rotate array to left by 1 place
public class Code_6 {
    private static int[] rotateBy1(int[] arr){
        int n = arr.length;

        reverse(arr,0,n-1);
        reverse(arr,0,n-2);

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
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotateBy1(arr)));
    }
}
