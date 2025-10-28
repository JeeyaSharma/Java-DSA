package recursion;

// Find the total no of occurrences of target in array using recursion and binary search
public class Recursion_6 {
    private static int totalOccurrences(int[] arr, int target){
        int firstOccurrence = firstOccurrence(arr, target, 0, arr.length-1);
        int lastOccurrence = lastOccurrence(arr, target, 0, arr.length-1);
        
        if(firstOccurrence == -1 || lastOccurrence== -1){
            return 0;
        }else{
            return lastOccurrence - firstOccurrence + 1;
        }
    }
    private static int firstOccurrence(int[] arr, int target, int start, int end){
        if(start>end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            int leftIndex = firstOccurrence(arr, target, start, mid-1);
            return (leftIndex != -1) ? leftIndex : mid;
        }else if(arr[mid]<target){
            return firstOccurrence(arr, target, mid+1, end);
        }else{
            return firstOccurrence(arr, target, start, mid-1);
        }
    }
    private static int lastOccurrence(int[] arr, int target, int start, int end){
        if(start>end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            int rightIndex = lastOccurrence(arr, target, mid+1, end);
            return (rightIndex != -1) ? rightIndex : mid;
        }else if(arr[mid]<target){
            return lastOccurrence(arr, target, mid+1, end);
        }else{
            return lastOccurrence(arr, target, start, mid-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        System.out.println(totalOccurrences(arr, 6));
    }
}
