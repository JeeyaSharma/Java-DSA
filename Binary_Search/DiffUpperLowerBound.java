/*
Write a program to print the difference of lower bound and upper bound
Example:
I/P: A = [1,3,5,7,9]
target=5
O/P: 2
Note: If target is equal to last element of array print -1
 */
import java.util.*;
public class DiffUpperLowerBound{
    private static int upperBound(int[] arr,int target){
        int upper=0;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return arr[mid-1];
            else if(arr[mid]<target){
                upper=arr[mid];
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
        }
        return upper;
    }
    private static int lowerBound(int[] arr, int target){
        int lower=0;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return target;
            else if(arr[mid]>target){
                lower=arr[mid];
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
        }
        return lower;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = S.nextInt();
        int diff= lowerBound(arr, target) - upperBound(arr, target);
        System.out.println("Difference b/w upper bound & lower bound: "+diff);
        S.close();
    }
}