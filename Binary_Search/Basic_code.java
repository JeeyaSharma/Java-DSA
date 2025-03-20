// find if the target is present in the array or not
import java.util.*;
public class Basic_code{
    private static boolean isPresent(int[] arr, int target){
        boolean flag=false;
        int start =0, end=arr.length-1;
        while(start<=end){
            // int mid=(start+end)/2;
            // optimized way to find mid
            int mid = start + (end-start)/2;
            if(arr[mid] > target) end= mid-1;
            else if(arr[mid] < target) start = mid+1;
            else if(arr[mid] == target){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = S.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        System.out.print("Enter target value: ");
        int target =S.nextInt();

        if(isPresent(arr, target)){
            System.out.println("Target is present in array");
        }else{
            System.out.println("Target is not present in array");
        }
        S.close();
    }
}