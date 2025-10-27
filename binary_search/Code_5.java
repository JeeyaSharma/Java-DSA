package binary_search;

// import java.util.Arrays;

// FInd pivot index in an array
public class Code_5 {
    private static int pivotIndex(int[] arr){
        int size = arr.length;
        int totalSum = 0;
        for(int i : arr) totalSum+=i;

        int leftSum = 0;
        for(int i=0;i<size;i++){
            if(leftSum == (totalSum-leftSum-arr[i])) return i;
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
