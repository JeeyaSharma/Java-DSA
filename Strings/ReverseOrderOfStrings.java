/*
Given a string of words, reverse the order of words in the string individually, not the whole string.
Complete the function revWordsOrder(str) that accepts a string as parameter and reverses the order of words of string.

Input Format:
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains the string str. 

Output Format:
For each test case, print the resultant string in new lines.

Sample Input
2
Code Quotient Loves Code
Hello Coders

Sample Output
Code Loves Quotient Code
Coders Hello
 */
import java.util.*;
public class ReverseOrderOfStrings{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = S.nextLine();
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i;i--){
            sb.append(strArr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
        S.close();
    }
}