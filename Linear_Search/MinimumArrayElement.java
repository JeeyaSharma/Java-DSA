import java.util.*;
public class MinimumArrayElement {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i] = S.nextInt();
        }
        System.out.println("Entered Array: "+Arrays.toString(arr));
        int min = arr[0];
        int index=0;
        for(int i=1;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        System.out.println("Minimum element in array is "+min+" at index "+index);
        S.close();
    }
}
