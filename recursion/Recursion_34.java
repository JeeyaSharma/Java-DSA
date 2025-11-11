package recursion;

import java.util.Arrays;

/*
Given an array of integers arr[], find the minimum and maximum elements in the array using recursion only. The first element of the output represents the minimum value, and the second element represents the maximum value in the array.

Examples:

Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
Output: [-5, 8]
Explanation: -5 is the minimum and 8 is the maximum element in the array

Input: arr[] = [12, 3, 15, 7, 9]
Output: [3, 15]
Explanation: 3 is the minimum and 15 is the maximum element in the array
 */

public class Recursion_34 {
    private static int[] findMinMax(int[] arr, int idx, int min, int max){
        if(idx>=arr.length){
            return new int[]{min,max};
        }

        if(arr[idx]>max){
            max = arr[idx];
        }
        if(arr[idx]<min){
            min = arr[idx];
        }

        return findMinMax(arr, idx+1, min, max);
    }    
    public static void main(String[] args){
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(Arrays.toString(findMinMax(arr, 0, Integer.MAX_VALUE, Integer.MIN_VALUE)));
    }
}
