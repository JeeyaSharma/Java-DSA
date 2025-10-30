package binary_search;

// Find the pivot element in a rotated sorted array
public class Code_6 {
    private static int pivotElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid]>=arr[0]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args){
        int[] arr = {3,8,10,17,1};
        System.out.println(pivotElement(arr));
    }
}
