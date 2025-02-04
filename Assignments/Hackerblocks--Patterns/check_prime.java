/*
 Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

Constraints
2 < N <= 1000000000

Sample Input
3
Sample Output
Prime
Explanation
The output is case specific
 */
import java.util.Scanner;
public class check_prime {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        boolean flag=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
            }
        }
        if(flag){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
        S.close();
    }
}
