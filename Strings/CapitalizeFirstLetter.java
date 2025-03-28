/*
Write a program which given a string, Capitalize first letter of each word in it.

Sample Input
code quotient

Sample Output
Code Quotient

Sample Input
get better at coding

Sample Output
Get Better At Coding
 */
import java.util.*;
public class CapitalizeFirstLetter{
    static String capitalize(String str){
        if(str.length() == 0){
            return str;
        }

        return Character.toUpperCase(str.charAt(0))+str.substring(1);
        
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = S.nextLine();

        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            words[i] = capitalize(words[i]);
        }
        String newString = String.join(" ",words);
        System.out.println(newString);
        S.close();
    }
}