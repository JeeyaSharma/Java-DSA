import java.util.*;
public class DeleteElementFromArray {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        System.out.println("Entered Array: "+Arrays.toString(arr));
        System.out.print("Index of element to be removed: ");
        int index = S.nextInt();
        for(int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=0;
        System.out.println("Array after deleting element: "+Arrays.toString(arr));
        S.close();
    }
}
