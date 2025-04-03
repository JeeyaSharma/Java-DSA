/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */
import java.util.*;
public class Leetcode_34{
    public static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};
        
        ans[0]=findAns(arr, target, true);
        ans[1]=findAns(arr,target,false);

        return ans;
    }
    private static int findAns(int[] arr, int target, boolean findStartValue){
        int start=0,end=arr.length-1,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findStartValue){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
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
        System.out.println("Answer: "+Arrays.toString(searchRange(arr, target)));
        S.close();
    }
}