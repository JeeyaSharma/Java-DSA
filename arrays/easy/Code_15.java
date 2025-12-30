package arrays.easy;

import java.util.Arrays;
import java.util.HashMap;

// Leetcode 1
// two sum
public class Code_15 {
    private static int[] twoSumBruteForce(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int rem = target - arr[i];
            for(int j=i+1;j<n;j++){
                if(rem==arr[j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    private static int[] twoSumBetter(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
    private static int[] twoSumOptimal(int[] arr, int target){
        int n = arr.length;
        int[][] numsWithIndex = new int[n][2];
        for(int i=0;i<n;i++){
            numsWithIndex[i][0] = arr[i];
            numsWithIndex[i][1] = i;
        }
        Arrays.sort(numsWithIndex, (a,b) -> Integer.compare(a[0],b[0]));
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = numsWithIndex[left][0] + numsWithIndex[right][0];
            if(sum == target){
                return new int[] {numsWithIndex[left][1],numsWithIndex[right][1]};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSumBruteForce(arr, 9)));
        System.out.println(Arrays.toString(twoSumBetter(arr, 9)));
        System.out.println(Arrays.toString(twoSumOptimal(arr, 9)));
    }
}
