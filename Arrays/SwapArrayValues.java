import java.util.Scanner;
import java.util.Arrays;
public class SwapArrayValues {
    public static int[] swap(int[] arr,int ind1,int ind2){
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
        return arr;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size=input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Array before swapping Elements: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the two indices of elements to be swapped: ");
        int index1=input.nextInt();
        int index2=input.nextInt();

        swap(arr,index1,index2);

        System.out.println("Array after Swapping: ");
        System.out.println(Arrays.toString(arr));

        input.close();
    }
}
