// Enter an array and a target element
// Search in the array and return the index
// if the element is not in the array, then return -1

import java.util.*;
public class FirstProgram{
    public static int targetIndex(int target, int[] array){
        if(array.length==0) return -1;
        int index=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Entered Array: "+Arrays.toString(arr));
        System.out.print("Enter target element: ");
        int target = input.nextInt();
        System.out.println("Index of target element: "+targetIndex(target, arr));
        input.close();
    }
}