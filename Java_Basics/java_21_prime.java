// Define a method to find out if a number is prime or not.
import java.util.*;
public class java_21_prime{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i*i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=S.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        S.close();
    }
}