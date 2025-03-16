import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Array before Reversing:\n"+Arrays.toString(arr));

        int start=0,end=size-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Array after Reversing:\n"+Arrays.toString(arr));
        input.close();
    }
}
