/*
Take as input S, a string. Write a function that replaces every even character with the character having just higher ASCII code and every odd character with the character having just lower ASCII code. Print the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abcg
Sample Output
badf
 */
import java.util.*;
public class StringsOddEvenChar{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if(i%2==0){
                currentChar+=1;
                newStr.append((char)currentChar);
            }else{
                currentChar-=1;
                newStr.append((char)currentChar);
            }
        }
        System.out.println(newStr);
        S.close();
    }
}