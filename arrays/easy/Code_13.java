package arrays.easy;

import java.util.HashMap;

// Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
public class Code_13 {
    private static int longestSubarray(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen = i+1;
            }
            if(map.containsKey(sum-k)){
                maxLen = Math.max(maxLen,map.get(sum-k));
            }
            map.putIfAbsent(sum, i);
        }
    }
    public static void main(String[] args){
        int[] arr = {-3, 2, 1};
        System.out.println(longestSubarray(arr, 6));
    }
}
