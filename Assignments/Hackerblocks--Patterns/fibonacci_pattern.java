/*
 Take N (number of rows), print the following pattern (for N = 4)
0
1 1
2 3 5
8 13 21 34

Constraints
0 < N < 100

Sample Input
4
Sample Output
0 
1    1 
2    3     5 
8   13    21    34
Explanation
Each number is separated from other by a tab. For given input n, You need to print n(n+1)/2 fibonacci numbers. Kth row contains , next k fibonacci numbers.
 */
import java.util.Scanner;
public class fibonacci_pattern {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a = 0;
        int b = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==0 && j==0){
                    System.out.print("0" + "\t");
                }
                else if(i==1 && j==0){
                    System.out.print("1" + "\t");
                }
                else{
                    int c= a + b;
                    System.out.print(c + "\t");
                    a=b;
                    b=c;
                }
            }
            System.out.println();
        }
        S.close();
    }  
}
