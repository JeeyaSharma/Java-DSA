// Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.*;
public class java_24_palindrome{
    public static boolean isPalindrome(int n){
        int num=n;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=S.nextInt();
        if(isPalindrome(n)){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not Palindrome");
        }
        S.close();
    }
}