package arrays.easy;

import java.util.HashMap;

// Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0. if the array contains positives, negatives and zeroes
public class Code_14 {
    private static int longestSubarray(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == k){
                maxLen = i+1;
            }
            int rem = sum - k;
            if(prefixSum.containsKey(rem)){
                int len = i - prefixSum.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!prefixSum.containsKey(rem)){
                prefixSum.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {-3,2,1};
        System.out.println(longestSubarray(arr, 3));
    }
}
