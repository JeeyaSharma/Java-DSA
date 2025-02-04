/*
 Given N, help Manmohan to print pattern upto N lines. For eg For N=6 , following pattern will be printed.

1
11
111
1001
11111
100001

Input Format
Single number N.

Constraints
N<=1000

Output Format
Pattern corresponding to N.

Sample Input
6
Sample Output
1 
11
111 
1001 
11111
100001
Explanation
For every odd number row print 1, odd number of times and for every even number row , print first and last character as 1 and rest of middle characters as 0.
 */
import java.util.Scanner;
public class Manmohan_pattern_1 {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    if(j==1 || j==i){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        S.close();
    }
}
