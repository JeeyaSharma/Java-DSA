/*
Write a function which given a string, count and return the palindrome words present in the string. A word in a string is separated with space(s).

Sample Input 1
Mom and Dad are my best friends

Sample Output 1
2

Explanation 1
﻿This string contains two palindrome words (i.e., Mom, Dad) so the count is 2.

Sample Input 2
mohit speaks english

Sample Output 2
0

Explanation 2
This string contains no palindrome words.
 */
import java.util.*;
public class PalindromeWords{
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
        System.out.println("Enter a string: ");
        String str = S.nextLine();
        String[] words = str.toLowerCase().split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                count++;
            }
        }
        System.out.println(count);
        S.close();
    }
}