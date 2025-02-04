/*
 Write a program to print square pattern by taking input N.

Input Format
The first line contains an integer N.

Output Format
Display the pattern as result.

Sample Input
5
Sample Output
1 2 3 4 5 
2 2 3 4 5 
3 3 3 4 5 
4 4 4 4 5 
5 5 5 5 5
 */
import java.util.Scanner;
public class square_pattern {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(i + "\t");
                }
                else{
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
        S.close();
    }
}
