/*
 Generate first n Prime numbers bookmark_border
Write a program to generate and print first m prime numbers in the first n positive integers. 

Input
Each test case will contains two integer n (limit till where prime numbers to be generated) and m (number of prime to generate) where n >=2 and m >=1. 
If there are not enough prime numbers upto n, then print all prime numbers up to n.

Output
For each input case, generate and print first m primes in the first n positive integers.

Sample Input
10 2

Sample Output
2
3

Explanation:
With n = 10 and m = 2, the first 2 prime numbers within the range 
 */
import java.util.*;
public class generate_1st_N_primes{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        int m=S.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            if(count==m) break;
            boolean flag=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                count++;
            }
        }
        S.close();
    }
}