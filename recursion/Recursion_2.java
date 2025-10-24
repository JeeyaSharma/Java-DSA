package recursion;

// Find the sum of array elements
public class Recursion_2 {
    private static int sumOfElements(int[] arr){
        return helper(arr, 0);
    }
    private static int helper(int[] arr, int i){
        if(i >= arr.length) return 0;

        return arr[i] + helper(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,1,1,1};
        System.out.println(sumOfElements(arr));
    }
}
