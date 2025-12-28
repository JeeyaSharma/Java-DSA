package arrays.easy;
// Max consecutive ones
// Leetcode 485
public class Code_11 {
    private static int findMaxConsecutiveOnes(int[] arr){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count = 0;
            }
            if(count>max) max = count;
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
