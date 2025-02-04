// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.*;
public class java_18_method_3{
    public static boolean voteEligibility(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=S.nextInt();
        if(voteEligibility(age)){
            System.out.print("Eligible to vote");
        }else{
            System.out.print("Not Eligible to vote");
        }
        S.close();
    }
}