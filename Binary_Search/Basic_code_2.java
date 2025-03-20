// find if the target is present in array or not, if present return its index and if not present, then return -1
import java.util.*;
public class Basic_code_2{
    private static int isPresent(int[] arr, int target){
        int index = -1;
        int start = 0, end = arr.length-1;
        while(start<=end){
            // int mid=(start+end)/2;
            // optimized way to find mid
            int mid = start + (end-start)/2;
            if(arr[mid] > target) end= mid-1;
            else if(arr[mid] < target) start = mid+1;
            else if(arr[mid] == target){
                index=mid;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = S.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = S.nextInt();
        System.out.println("Target is at index: "+ isPresent(arr, target));
        S.close();
    }
}