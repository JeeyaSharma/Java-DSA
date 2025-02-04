/*
 Take N as input. Print all prime numbers from 2 to N.

Constraints
1 <= N <= 1000

Sample Input
10
Sample Output
2
3
5
7
Explanation
Each output should be on separate line. A prime number is that number which is divisible by one or itself.
 */
import java.util.Scanner;
public class print_primes {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for(int i=2;i<=n;i++){
            boolean flag=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
        S.close();
    }    
}
