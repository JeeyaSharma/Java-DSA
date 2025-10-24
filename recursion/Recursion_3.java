package recursion;

public class Recursion_3 {
    private static int linearSearch(int[] arr,int target, int i){
        if(i >= arr.length) return -1;
        if(arr[i] == target) return i;
        else return linearSearch(arr, target, i+1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,7,8};
        int target = 8;
        System.out.println(linearSearch(arr, target, 0));
    }
}
