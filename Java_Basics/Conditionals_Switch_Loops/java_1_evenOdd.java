/*
 Write a program to print whether a number is even or odd, also take input from the user.
 */
import java.util.*;
public class java_1_evenOdd{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int num=S.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        S.close();
    }
}