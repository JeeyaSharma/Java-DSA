/*
Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2d1s1.

Input Format
A single String S

Constraints
1 < = length of String < = 1000

Output Format
The compressed String.


Sample Input
aaabbccds
Sample Output
a3b2c2d1s1
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice and 'd and 's' occurred only once.
 */
import java.util.*;
public class StringCompression{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = S.nextLine();
        StringBuilder compressedStr = new StringBuilder();
        int i=0;
        while(i<str.length()){
            char currentChar = str.charAt(i);
            int count=1;
            while(i+1<str.length() && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            }
            compressedStr.append(currentChar).append(count);
            i++;
        }
        System.out.println(compressedStr);
        S.close();
    }
}