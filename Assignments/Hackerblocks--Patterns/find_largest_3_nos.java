/*
 Input three numbers, print the largest of these numbers

Input Format
Three numbers (both positive and negative numbers are allowed)

Output Format
the largest number

Sample Input
5 7 4
Sample Output
7
 */
import java.util.Scanner;
public class find_largest_3_nos {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();
        int c = S.nextInt();
        int max = a;

        if(b>max){
            max=b;
        }
        else if(c>max){
            max=c;
        }

        System.out.print(max);
        S.close();
    }    
}
