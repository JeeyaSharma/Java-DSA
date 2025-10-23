package recursion;

// Create a recursive function to find out if an array is sorted or not
public class Recursion_1 {

    private static boolean isSorted(int[] arr){
        if(arr.length == 0 || arr.length == 1) return true;
       return helper(arr, 0);
    }
    private static boolean helper(int[] arr, int i){
        if(i == arr.length-1) return true;
        if(i < arr.length && arr[i]>arr[i+1]) return false;

        return helper(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8,9,0};
        System.out.println(isSorted(arr));
    }
}
