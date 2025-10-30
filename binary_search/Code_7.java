package binary_search;

// Search for target in rotated sorted array
public class Code_7 {
    private static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    private static int findPivotIndex(int[] arr, int start, int end){
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>=arr[0]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    private static int searchTarget(int[] arr, int target){
        int arrSize = arr.length;
        int pivot = findPivotIndex(arr, 0, arrSize);
        if(arr[pivot]<=target && arr[arrSize-1]>=target){
            return binarySearch(arr, target, pivot, arrSize-1);
        }else{
            return binarySearch(arr, target, 0, pivot-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(searchTarget(arr, 6));
    }
}
