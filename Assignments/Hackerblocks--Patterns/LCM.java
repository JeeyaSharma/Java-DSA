/*
Take the following as input.
A number (N1)
A number (N2)
Write a function which returns the LCM of N1 and N2. Print the value returned.

Constraints
0 < N1 < 1000000000
0 < N2 < 1000000000

Sample Input
4 
6
Sample Output
12
Explanation
The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2.
 */
import java.util.*;
public class LCM{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n1=S.nextInt();
        int n2=S.nextInt();
        int lcm=(n1>n2) ? n1:n2;
        while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.print(lcm);
                break;
            }
            lcm++;
        }
        S.close();
    }
}