package binary_search;

// Find the upper bound of target
// Upper bound is the smallest index greater than target
public class Code_9 {
    private static int findUpperBound(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<=target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args){
        int[] arr = {2,3,6,7,8,8,11,11,11,12};
        System.out.println(findUpperBound(arr, 12, 0, arr.length-1));
    }
}
