/*
 Take N as input. For a value of N=7, we wish to draw the following pattern :
                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 

Input Format
Take N as input.

Constraints
N is odd number.

Output Format
Pattern should be printed with a space between every two values.

Sample Input
7
Sample Output
            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
Explanation
Catch the pattern and print it accordingly.
 */
import java.util.*;
public class pattern_double_sided_arrow{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        for(int i=1;i<=n/2+1;i++){
            for(int k=n-1;k>1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        S.close();
    }
}