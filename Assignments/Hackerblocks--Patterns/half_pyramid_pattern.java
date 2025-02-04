/*
 Write a program to print given pattern by taking input N.
Input Format
The first line contains an integer N.

Output Format
Display the pattern as result.

Sample Input
5
Sample Output
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
 */
import java.util.Scanner;
public class half_pyramid_pattern {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        S.close();
    }
}
