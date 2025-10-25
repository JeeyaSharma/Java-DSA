package binary_search;

// Find total no of Occurrences of target in a sorted array
public class Code_3 {
    private static int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                index = mid;
                end = mid -1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return index;
    }
    private static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                index = mid;
                start = mid + 1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,3,3,3,5};
        int target = 7;
        
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if(first == -1 || last == -1){
            System.out.println(0);
        }else{
            System.out.println(last - first + 1);
        }
    }
}
