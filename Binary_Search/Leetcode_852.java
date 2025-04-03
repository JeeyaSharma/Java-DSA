/*
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
 
Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1

Constraints:
3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
 */
import java.util.*;
public class Leetcode_852{
    private static int peakIndexInMountainArray(int[] arr){
        int start=0,end=arr.length-1,peak=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                peak=mid;
                end=mid-1;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return peak;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = S.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        System.out.println("Peak index in mountain array: "+peakIndexInMountainArray(arr));
        S.close();
    }
}