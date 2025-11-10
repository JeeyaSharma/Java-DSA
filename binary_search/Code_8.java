package binary_search;

// Find the lower bound of a target element
// Lower bound is the smallest value greater than equal to the target
public class Code_8 {
    private static int findLowerBound(int[] arr, int target){
        return lowerBoundHelper(arr, target, 0, arr.length-1);
    }
    private static int lowerBoundHelper(int[] arr, int target, int start, int end){
       while(start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid]<target){
            start = mid+1;
        }else{
            end = mid-1;
        }
       }
       return start;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,3,7,8,9,9,9,11};
        System.out.println(findLowerBound(arr, 9));
    }
}
