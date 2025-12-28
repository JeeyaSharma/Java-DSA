package arrays.easy;
// Leetcode 268
public class Code_10 {
    private static int findMissingNumber(int[] arr){
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0;i<arr.length;i++){
            xor1 = xor1^(i+1);
            xor2 = xor2^arr[i];
        }
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(findMissingNumber(arr));
    }
}
