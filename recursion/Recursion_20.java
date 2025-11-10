package recursion;

// Find the upper bound of target using binary search and recursion
public class Recursion_20 {
    private static int findUpperBound(int[] arr,int target, int start, int end){
        if(start>end) return start;
        int mid = start + (end-start)/2;
        if(arr[mid]<=target){
            return findUpperBound(arr, target, mid+1, end);
        }else{
            return findUpperBound(arr, target, start, mid-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {2,3,6,7,8,8,11,11,11,12};
        System.out.println(findUpperBound(arr, 9, 0, arr.length-1));
    }
}
