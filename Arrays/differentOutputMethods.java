//Using for-each loop to print the array and also converting the array to a string and then printing it as a second method for printing the array
import java.util.*;
public class differentOutputMethods{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=S.nextInt();
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Printing the array as a String: ");
        System.out.println(Arrays.toString(arr));
        S.close();
    }
}