package recursion;

public class Recursion_19 {
    private static int findLowerBound(int[] arr, int target, int start, int end){
        if(start>end){
            return start;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]<target){
            return findLowerBound(arr, target, mid+1, end);
        }else{
            return findLowerBound(arr, target, start, mid-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,3,7,8,9,9,9,11};
        System.out.println(findLowerBound(arr, 9,0,arr.length-1));
    }
}
