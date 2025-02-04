//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class java_3_simple_interest{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);

        System.out.print("Enter principle: ");
        int p = S.nextInt();

        System.out.print("Enter time: ");
        int t = S.nextInt();

        System.out.print("Enter rate: ");
        int r = S.nextInt();

        float SI=(p*t*r)/100;
        System.out.println("Simple Interest: "+SI);
        S.close();
    }
}