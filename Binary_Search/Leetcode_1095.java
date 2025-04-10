/*
(This problem is an interactive problem.)
You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

Example 1:
Input: mountainArr = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Example 2:
Input: mountainArr = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
 
Constraints:
3 <= mountainArr.length() <= 104
0 <= target <= 109
0 <= mountainArr.get(index) <= 109
 */
import java.util.*;
public class Leetcode_1095{
    public static int findInMountainArray(int target, int[] arr){
        int peakIndex=findPeakIndex(arr);
        int index=-1;
        if(target==arr[peakIndex]) return peakIndex;
        int start=0,end_first=peakIndex,end=arr.length-1;
        while(start<=end_first){
            int mid=start+(end_first-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target) end_first=mid-1;
            else if(arr[mid]<target) start=mid+1;
        }
        if(index<0){
            int s=peakIndex;
            while(s<=end){
                int mid=s+(end-s)/2;
                if(arr[mid]==target) return mid;
                else if(arr[mid]>target) s=mid+1;
                else end=mid-1;
            }
        }
        return index;
    }
    public static int findPeakIndex(int[] arr){
        int index=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                index=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return index;
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
        int target=S.nextInt();
        System.out.println("Peak index: "+findPeakIndex(arr));
        System.out.println("Ans: "+findInMountainArray(target, arr));
        S.close();
    }
}