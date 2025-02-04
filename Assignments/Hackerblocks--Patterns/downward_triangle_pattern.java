/*
Write a program to print given pattern by taking input N.

Input Format
The first line contains an integer N.

Output Format
Display the pattern as result.

Sample Input
6
Sample Output
* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
 */
import java.util.*;
public class downward_triangle_pattern{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        S.close();
    }
}