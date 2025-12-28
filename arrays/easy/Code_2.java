package arrays.easy;
// find second largest value and second Smallest value in an array without sorting
public class Code_2 {
    private static int secondLargestElement(int[] arr){
        if(arr.length<2) return -1;
        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > sLargest){
                sLargest = arr[i];
            }
        }
        return (sLargest == Integer.MIN_VALUE) ? -1 : sLargest;
    }
    private static int secondSmallestElement(int[] arr){
        if(arr.length<2) return -1;
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < sSmallest){
                sSmallest = arr[i];
            }
        }
        return (sSmallest == Integer.MAX_VALUE) ? -1 : sSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {8,8,7,6,5};
        System.out.println(secondLargestElement(arr));
        System.out.println(secondSmallestElement(arr));
    }
}
