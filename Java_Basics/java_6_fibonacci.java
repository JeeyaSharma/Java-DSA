// Print n fibonacci numbers and also mention the nth fibonacci number
import java.util.*;
public class java_6_fibonacci{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=S.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
        }
        System.out.print("Nth Fibonacci number: "+c);
        S.close();
    }
}