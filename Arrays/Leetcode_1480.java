/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
 

Constraints:
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */
import java.util.*;
public class Leetcode_1480{
    public static int[] runningSum(int[] nums){
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            ans[i]=sum;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size=S.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        System.out.println("Entered Array: "+Arrays.toString(arr));
        System.out.println("Required Array: "+Arrays.toString(runningSum(arr)));
        S.close();
    }
}