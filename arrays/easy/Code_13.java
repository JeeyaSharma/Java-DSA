package arrays.easy;
// Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0. if the array contains only positives and zeroes
public class Code_13 {
    private static int longestSubarray(int[] arr, int k){
        int maxLen = 0;
        int sum = arr[0];
        int left = 0;
        int right = 0;
        while(right<arr.length){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
            if(right < arr.length){
                sum += arr[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(longestSubarray(arr, 15));
    }
}
