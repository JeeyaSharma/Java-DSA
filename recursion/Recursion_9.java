package recursion;

// Find target in rotated sorted array using recursion
public class Recursion_9 {
    private static int binarySearch(int[] arr, int target, int start, int end){
        if(start>end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid]<target){
            return binarySearch(arr, target, mid+1, end);
        }else{
            return binarySearch(arr, target, start, mid-1);
        }
    }
    private static int findPivotIndex(int[] arr, int start, int end){
        if(start>=end) return start;
        int mid = start + (end-start)/2;
        if(arr[mid]>=arr[0]){
            return findPivotIndex(arr, mid+1, end);
        }else{
            return findPivotIndex(arr, start, mid);
        }
    }
    private static int searchTarget(int[] arr, int target){
        int lastIndex = arr.length-1;
        int pivot = findPivotIndex(arr, 0, lastIndex);
        if(arr[pivot]<=target && arr[lastIndex]>=target){
            return binarySearch(arr, target, pivot, lastIndex);
        }else{
            return binarySearch(arr, target, 0, pivot-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchTarget(arr, target));
    }
}
