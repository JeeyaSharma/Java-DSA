// Write a program to print the sum of two numbers entered by user by defining your own method.
// Define a method that returns the product of two numbers entered by user.
import java.util.*;
public class java_19_sum_product{
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int product(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1=S.nextInt();
        int num2=S.nextInt();
        System.out.println("Sum of two numbers: "+sum(num1,num2));
        System.out.println("Product of two numbers: "+product(num1,num2));
        S.close();
    }
}