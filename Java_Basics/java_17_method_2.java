// Define a program to find out whether a given number is even or odd.
import java.util.*;
public class java_17_method_2{
    public static boolean EvenOdd(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= S.nextInt();
        if(EvenOdd((n))){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
        S.close();
    }
}