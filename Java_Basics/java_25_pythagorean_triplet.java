// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.*;
public class java_25_pythagorean_triplet{
    public static boolean isPythagoreanTriplet(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                for(int k=j+1;k<len;k++){
                    int x=arr[i]*arr[i];
                    int y=arr[j]*arr[j];
                    int z=arr[k]*arr[k];

                    if(x==y+z || y==x+z || z==x+y){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=S.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        if(isPythagoreanTriplet(arr)){
            System.out.println("It is a Pythagorean Triplet.");
        }else{
            System.out.println("It is not a Pythagorean Triplet.");
        }
        S.close();
    }
}