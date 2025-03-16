import java.util.Scanner;
import java.util.Arrays;
public class ArrayMaxValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Entered Array:\n"+Arrays.toString(arr));

        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Maximum ELement in Array: "+max);
        input.close();
    }
}
