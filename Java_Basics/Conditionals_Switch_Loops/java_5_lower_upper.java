/*
 Take an input character from the keyboard and check whether it is upper case or lower case alphabet
 */
import java.util.*;
public class java_5_lower_upper{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=S.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.print("lowercase");
        }else{
            System.out.print("UPPERCASE");
        }
        S.close();
    }
}