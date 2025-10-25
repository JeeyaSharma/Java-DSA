package binary_search;

import java.util.Arrays;

// Find the First and Last Occurrence of an Element
// Approach : We will find the first index in first half of the array and second index in second half of array
public class Code_2 {
    private static int findFirstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                index = mid;
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return index;
    }
    private static int findLastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int  index = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                index = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                start = mid +1 ;
            }else{
                end = mid - 1;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 6;

        int[] ans = new int[2];

        ans[0] = findFirstOccurrence(arr, target);
        ans[1] = findLastOccurrence(arr, target);

        System.out.println(Arrays.toString(ans));
    }
}
