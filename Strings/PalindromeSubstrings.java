/*
Take as input S, a string. Write a program that gives the count of substrings of this string which are palindromes and Print the ans.

Input Format
Single line input containing a string

Constraints
Length of string is between 1 to 1000.

Output Format
Integer output showing the number of palindromic substrings.

Sample Input
abc
Sample Output
3
Explanation
For the given sample case , the palindromic substrings of the string abc are "a","b" and "c".So, the ans is 3.
 */
import java.util.*;
public class PalindromeSubstrings{
    static boolean isPalindrome(String str){
        int start=0,end=str.length()-1;
        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))){
                    count++;
                }
            }
        }
        System.out.println(count);
        S.close();
    }
}