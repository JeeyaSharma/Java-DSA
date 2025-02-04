/*
 Write a program to print given pattern by taking input N.

Input Format
The first line contains an integer N.

Output Format
Display the pattern as result.

Sample Input
5
Sample Output
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
 */
import java.util.Scanner;
public class star_pattern {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        S.close();
    }
}
