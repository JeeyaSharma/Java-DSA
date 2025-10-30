package recursion;

// Find the pivot index in a rotated sorted array
public class Recursion_8 {
    private static int findPivot(int[] arr){
        return findPivotHelper(arr, 0, arr.length-1);
    }
    private static int findPivotHelper(int[] arr, int start, int end){
        if(start>=end) return start;
        int mid = start + (end-start)/2;
        if(arr[mid]>=arr[0]){
            return findPivotHelper(arr, mid+1, end);
        }else{
            return findPivotHelper(arr, start, mid);
        }
    }
    public static void main(String[] args){
        int[] arr = {8,10,17,1,2};
        System.out.println(findPivot(arr));
    }
}
