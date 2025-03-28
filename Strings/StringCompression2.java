/*
Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.

Input Format
A single String S.

Constraints
A string of length between 1 to 1000

Output Format
The compressed String.

Sample Input
aaabbccds
Sample Output
a3b2c2ds
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.
 */
import java.util.*;
public class StringCompression2{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        StringBuilder compressedStr = new StringBuilder();
        int i=0;
        while(i<str.length()){
            char currentChar= str.charAt(i);
            int count=1;

            while(i+1<str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            if(count==1){
                compressedStr.append(currentChar);
            }else{
                compressedStr.append(currentChar).append(count);
            }
            i++;
        }
        System.out.println(compressedStr);
        S.close();
    }
}