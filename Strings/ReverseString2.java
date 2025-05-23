/*
Given a string, the task is to reverse it.
For example, if the string is "Hello" , reversed string is "olleH".
Complete the function reverseString() given in the editor that accepts a string & reverses it.

Input Format:
First line inputs number of Testcases t
Then t strings follow in each line

Output Format:
For each test case output the reversed string

Sample Input 1
1
codequotient

Sample Output 1
tneitouqedoc

Sample Input 2
1
programming

Sample Output 2
gnimmargorp
 */
import java.util.*;
public class ReverseString2{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = S.nextLine();
        StringBuilder rev = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        System.out.println(rev);
        S.close();
    }
}