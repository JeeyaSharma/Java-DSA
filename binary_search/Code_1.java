package binary_search;

public class Code_1 {
    private static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,3,4,6,8,10};
         System.out.println(binarySearch(arr, 0));
    }
}
