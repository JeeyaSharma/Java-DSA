package arrays.easy;

import java.util.Arrays;

// Move zeroes to end
// Leetcode 283
public class Code_7 {
    private static void moveZerosToEnd(int[] arr){
        int j = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
