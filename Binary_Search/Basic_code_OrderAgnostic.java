/*
What if the array is sorted in descending order, then the code will not work
We will have to optimize the code accordingly
 */
import java.util.*;
public class Basic_code_OrderAgnostic{
    static int OrderAgnosticBS(int[] arr, int target){
        int start=0, end= arr.length-1;
        boolean isAsc= arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(isAsc){
                if(arr[mid] < target){
                    start=mid+1;
                }
                else if(arr[mid] > target){
                    end = mid-1;
                }
                else if(arr[mid]==target){
                    return mid;
                }
            }else{
                if(arr[mid] < target){
                    end = mid-1;
                }
                else if(arr[mid] > target){
                    start = mid+1;
                }
                else if(arr[mid] == target){
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
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

        System.out.println("Target is present at index: "+OrderAgnosticBS(arr,target));
        S.close();
    }
}