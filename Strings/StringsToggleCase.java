/*
Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abC
Sample Output
ABc
Explanation
Toggle Case means to change UpperCase character to LowerCase character and vice-versa.
 */
import java.util.*;
public class StringsToggleCase{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = S.nextLine();
        StringBuilder newString = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if(currentChar >= 'a' && currentChar<='z'){
                newString.append(Character.toUpperCase(currentChar));
            }else{
                newString.append(Character.toLowerCase(currentChar));
            }
        }
        System.out.println(newString);
        S.close();
    }
}