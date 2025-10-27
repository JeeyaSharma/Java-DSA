package binary_search;

// find the peak index of mountain array
public class Code_4 {
    private static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,6};
        System.out.println(findPeakIndex(arr));
    }
}
