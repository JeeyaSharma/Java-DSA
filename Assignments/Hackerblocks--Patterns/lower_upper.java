/*
 Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" is character lies between 'A-Z' and print "Invalid" for all other characters like $,.^# etc.

Input Format
Single Character .

Output Format
lowercase UPPERCASE Invalid


Sample Input
$
Sample Output
Invalid
 */

import java.util.Scanner;
public class lower_upper{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        char c = S.next().charAt(0);

        if(c>='a' && c<='z'){
            System.out.print("lowercase");
        }
        else if(c>='A' && c<='Z'){
            System.out.print("UPPERCASE");
        }
        else{
            System.out.print("Invalid");
        }
        S.close();
    }
}