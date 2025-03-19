import java.util.*;
public class InsertElementInArray {
    public static void main(String[] args){
        Scanner S = new  Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        System.out.print("Enter value to be inserted: ");
        int value = S.nextInt();
        System.out.print("Enter index of value to be inserted at: ");
        int index= S.nextInt();
        for(int i=size-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
        System.out.println(Arrays.toString(arr));
        S.close();
    }
}
