/*
Take as input S, a string. Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.

Input Format
String

Constraints
Length of String should be between 2 to 1000.

Output Format
String

Sample Input
acb
Sample Output
a2c-1b
Explanation
For the sample case, the Ascii code of a=97 and c=99 ,the difference between c and a is 2.Similarly ,the Ascii code of b=98 and c=99 and their difference is -1. So the ans is a2c-1b.
 */
import java.util.*;
public class DifferenceInASCIICodes{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            
            char currentChar = str.charAt(i);
            int diff = str.charAt(i+1) - str.charAt(i);
            newStr.append(currentChar).append(diff);
        }
        newStr.append(str.charAt(str.length()-1));
        System.out.println(newStr);
        S.close();
    }
}