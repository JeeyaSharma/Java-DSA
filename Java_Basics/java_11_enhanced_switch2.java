//Input a number and specify if it is a weekday or a weekend
import java.util.*;
public class java_11_enhanced_switch2{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number between 1-7: ");
        int n=S.nextInt();
        switch(n){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Please enter a valid input.");
        }
        S.close();
    }
}