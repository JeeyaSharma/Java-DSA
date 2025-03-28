/*
Write a program which given a string, swap first and last character of each word in it.

Complete the function swapFirstLastChar() that accepts a multiword string and swaps the first and last character of every word in it.

Note: Every two adjacent words in the given string will be separated by exactly one space character.

Input Format
The first line of input consists number of testcases, T
The next T lines contains a string on which the said operation is to be performed

Output Format
For each testcase, print the string after doing the given operatio

Sample Input
2
Code Quotient
Get better at coding

Sample Output
eodC tuotienQ
teG retteb ta godinc
 */
import java.util.*;
public class SwapCharacters{
    static String swap(String str){
        if(str.length() == 1){
            return str;
        }
        char[] chars = str.toCharArray();

        char temp = chars[0];
        chars[0] = chars[chars.length-1];
        chars[chars.length-1]=temp;

        String newString = new String(chars);

        return newString;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int test = S.nextInt();
        S.nextLine();
        for(int t=0;t<test;t++){
            System.out.print("Enter a string: ");
            String str = S.nextLine();
            String[] words = str.split(" ");
            for(int i=0;i<words.length;i++){
                words[i] = swap(words[i]);
            }
            System.out.println(String.join(" ",words));
        }
        S.close();
    }
}