package arrays.easy;
// Leetcode 1752
public class Code_3 {
    private static boolean bruteForce(int[] arr){
        int n = arr.length;
        int[] temp = new int[n*2];
        for(int i=0;i<n;i++){
            temp[i] = arr[i];
            temp[i+n] = arr[i];
        }
        int left = 0;
        for(int right = 1;right<n*2;right++){
            if(temp[right]<temp[right-1]) left = right;
            if(right-left+1 == n) return true;
        }
        return false;
    }
    private static boolean optimal(int[] arr){
        int n = arr.length;
        int count = 1;
        for(int i=1;i<2*n;i++){
            if(arr[(i-1)%n] <= arr[i % n]) count++;
            else count=1;
            if(count==n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,1,3,4};
        System.out.println(bruteForce(arr));
        System.out.println(optimal(arr));
    }
}
