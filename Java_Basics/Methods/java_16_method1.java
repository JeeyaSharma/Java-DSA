// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.*;
public class java_16_method1{
    public static int max(int num1,int num2,int num3){
        int max=Math.max(num1,Math.max(num2,num3));
        return max;
    }
    public static int min(int num1,int num2,int num3){
        int min=Math.min(num1,Math.min(num2,num3));
        return min;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=S.nextInt();
        int b=S.nextInt();
        int c=S.nextInt();
        System.out.println("Maximum number: "+max(a,b,c));
        System.out.println("Minimum number: "+min(a,b,c));
        S.close();
    }
}