// Swap all elements with even index to its next element
import java.util.*;
public class SwapEvenIndexElements{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = S.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        // Swapping code
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        S.close();
    }
}