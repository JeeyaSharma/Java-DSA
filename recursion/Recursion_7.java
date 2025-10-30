package recursion;

// Find Peak index of array using recursion
public class Recursion_7 {
    private static int peakIndex(int[] arr){
        return peakIndexHelper(arr, 0, arr.length-1);
    }
    private static int peakIndexHelper(int[] arr, int start, int end){
        if(start >= end) return start;
        int mid = start + (end-start)/2;
        if(arr[mid]<arr[mid+1]){
            return peakIndexHelper(arr, mid+1, end);
        }else{
            return peakIndexHelper(arr, start, mid);
        }
    }
    public static void main(String[] args){
        int[] arr = {0,2,1,0};
        System.out.println(peakIndex(arr));
    }
}
