import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = S.next();
        boolean flag = true;
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("Entered string is palindrome");
        }else{
            System.out.println("Entered string is not palindrome");
        }
        S.close();
    }
}
