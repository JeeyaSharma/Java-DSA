package recursion;

// Find first and last position of target using recursion and binary search
public class Recursion_5 {
    private static int firstOccurrence(int[] arr, int target){
        return firstOccurrenceHelper(arr, target, 0, arr.length-1);
    }
    private static int firstOccurrenceHelper(int[] arr, int target,int start,int end){
        if(start>end) return -1;
        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            int leftIndex = firstOccurrenceHelper(arr, target, start, mid-1);
            return (leftIndex != -1) ? leftIndex : mid;
        }else if(arr[mid] < target){
            return firstOccurrenceHelper(arr, target, mid+1, end);
        }else{
            return firstOccurrenceHelper(arr, target, start, mid-1);
        }
    }
    private static int lastOccurrence(int[] arr, int target){
        return lastOccurrenceHelper(arr, target, 0, arr.length-1);
    }
    private static int lastOccurrenceHelper(int[] arr, int target, int start, int end){
        if(start>end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            int rightIndex = lastOccurrenceHelper(arr, target, mid+1, end);
            return (rightIndex != -1) ? rightIndex : mid;
        }else if(arr[mid]<target){
            return lastOccurrenceHelper(arr, target, mid+1, end);
        }else{
            return lastOccurrenceHelper(arr, target, start, mid-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        System.out.println(firstOccurrence(arr, 6));
        System.out.println(lastOccurrence(arr, 6));
    }
}
