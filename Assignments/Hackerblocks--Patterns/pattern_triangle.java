/*
 Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4

Constraints
0 < N < 10

Sample Input
4
Sample Output
            1
		2	3	2
	3	4	5	4	3
4	5	6	7	6	5	4
Explanation
Each number is separated from other by a tab.
 */
import java.util.*;
public class pattern_triangle{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        for(int i=1;i<=n;i++){
            int val=i;
            for(int j=n-i;j>=1;j--){
                System.out.print("\t");
            }
            for(int k=1;k<=i;k++){
                System.out.print(val+"\t");
                val++;
            }
            val-=1;
            for(int a=i-1;a>=1;a--){
                val-=1;
                System.out.print(val+"\t");
            }
            System.out.println();
        }
        S.close();
    }
}