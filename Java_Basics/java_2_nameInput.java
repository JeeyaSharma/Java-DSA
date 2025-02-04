//Take name as input and print a greeting message for that particular name.
import java.util.*;
public class java_2_nameInput{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=S.nextLine();
        System.out.print("Hello "+name);
        S.close();
    }
}