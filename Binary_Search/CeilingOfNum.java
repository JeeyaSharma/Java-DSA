/*
Ceiling of a number is the smallest element greater than or equal to target in an array
Find the ceiling of the target 
Array is sorted
Take care for both asc and desc arrays
 */
import java.util.*;
public class CeilingOfNum{

    static int TargetCeiling(int[] arr, int target){
        int start =0, end = arr.length-1;
        int ceiling=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }

            boolean isAsc = arr[start] < arr[end];

            if(isAsc){
                if(arr[mid]> target){
                    ceiling = arr[mid];
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid-1;
                }else{
                    ceiling = arr[mid];
                    start = mid+1;
                }
            }
        }
        return ceiling;
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

        System.out.println("Ceiling of target ("+target+"): "+TargetCeiling(arr, target));
        S.close();
    }
}