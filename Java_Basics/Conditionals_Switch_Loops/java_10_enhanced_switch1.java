// Print the day as per numbers from 1-7
import java.util.*;
public class java_10_enhanced_switch1{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number between 1-7: ");
        int n=S.nextInt();
        switch(n){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter a valid number.");
        }
        S.close();
    }
}