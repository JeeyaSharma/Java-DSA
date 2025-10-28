package recursion;

public class Recursion_4 {
    private static int binarySearch(int[] arr, int target){
        return helper(arr,target,0,arr.length-1);
    }
    private static int helper(int[] arr, int target, int start, int end){
        if(start>end) return -1;

        int mid = start + (end-start)/2;

        if(arr[mid]==target) return mid;
        else if(arr[mid]<target) return helper(arr,target,mid+1,end);
        else return helper(arr,target,start,mid-1);
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,7,8,9};
        int target = 5;

        System.out.println(binarySearch(arr, target));
    }
}
