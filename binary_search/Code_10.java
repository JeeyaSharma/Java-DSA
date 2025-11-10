package binary_search;

// Find the floor and ceil of target in a sorted array
// Floor is the greatest number equal to or smaller than target
// Ceil is the smallest number greater than equal to target
public class Code_10 {
    private static int findFloor(int[] arr,int target,int start,int end){
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                index = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return index;
    }
    private static int findCeil(int[] arr, int target,int start, int end){
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
        int[] arr = {10,20,30,40,50};
        System.out.println("Floor: "+findFloor(arr, 25, 0, arr.length-1));
        System.out.println("Ceiling: "+findCeil(arr, 25, 0, arr.length-1));
    }
}
