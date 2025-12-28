package arrays.easy;

// find largest element in an array
public class Code_1 {
    private static int largestElement(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,2,6,7,10};
        System.out.println(largestElement(arr));
    }
}
