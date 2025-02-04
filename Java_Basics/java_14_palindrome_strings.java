// To find out whether the given String is Palindrome or not.
import java.util.*;
public class java_14_palindrome_strings{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str=S.nextLine();
        boolean is_palindrome=true;
        for(int si=0,ei=str.length()-1;si<ei;si++,ei--){
            if(str.charAt(si)!=str.charAt(ei)){
                is_palindrome=false;
                break;
            }
        }
        if(is_palindrome){
            System.out.print(str+" is Palindrome.");
        }else{
            System.out.print(str+" is not a Palindrome.");
        }
        S.close();
    }
}