package arrays.easy;
// linear Search: return index of target, if not present return -1
public class Code_8 {
    private static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, -4, 4, 0, 10};
        System.out.println(linearSearch(arr, 3));
    }
}
