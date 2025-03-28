/*
Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000

Output Format
String

Sample Input
aabccba
Sample Output
abcba
Explanation
For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.

After removing all of the consecutive occurences, the Final ans will be : - "abcba".
 */
import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        StringBuilder newStr = new StringBuilder();
        int i=0;
        while(i<str.length()){
            char currentChar = str.charAt(i);
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                i++;
                continue;
            }
            newStr.append(currentChar);
            i++;
        }
        System.out.println(newStr);
        S.close();
    }
}