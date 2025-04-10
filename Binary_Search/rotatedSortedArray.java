/*
SEARCH IN ROTATED ARRAY
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1
 

Constraints:
1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
 */
import java.util.*;
public class rotatedSortedArray{
    private static int binarySearch(int[] arr, int target, int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) end=mid-1;
            else if(arr[mid]<target) start=mid+1;
        }
        return -1;
    }
    private static int findInRotatedSortedArray(int[] arr, int target){
        if(arr[0]<arr[arr.length-1]){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        int start=0,end=arr.length-1;
        int pivot=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                pivot=mid;
                break;
            }else if(mid>0 && arr[mid]<arr[mid-1]){
                pivot=mid-1;
                break;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Pivot: "+pivot);
        int index=-1;
        index=binarySearch(arr, target, 0, pivot);
        if(index<0){
            index=binarySearch(arr, target, pivot+1, arr.length-1);
        }
        return index;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        System.out.println("Enter target value: ");
        int target = S.nextInt();
        System.out.println("Ans: "+findInRotatedSortedArray(arr, target));
        S.close();
    }
}