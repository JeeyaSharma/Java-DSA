/*
 Take as input N, a number. Print the pattern as given in the input and output section.

Input Format
Enter value of N

Constraints
1 <= N < 10

Output Format
Print the pattern.

Sample Input
7
Sample Output
 1******
 12*****
 123****
 1234***
 12345**
 123456*
 1234567
Explanation
There is no space between any two numbers. Catch the pattern for corresponding input and print them accordingly.
 */
import java.util.Scanner;
public class pattern_number_star {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=n-i;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        S.close();
    }
}
