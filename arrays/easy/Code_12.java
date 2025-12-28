package arrays.easy;
// Leetcode 136
public class Code_12 {
    private static int singleNumber(int[] arr){
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}
