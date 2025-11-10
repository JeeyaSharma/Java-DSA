package recursion;

import java.util.Arrays;

public class Recursion_26 {
    // private static void reverseArray(int[] arr, int i, int j){
    //     if(i>=j || i<0 || j>=arr.length) return;

    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;

    //     reverseArray(arr, i+1, j-1);
    // }
    private static void reverseArray(int[] arr, int i){
        if(i>arr.length/2) return;

        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;

        reverseArray(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        // reverseArray(arr, 0, arr.length-1);
        reverseArray(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
