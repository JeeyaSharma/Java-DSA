/*
Write a program to find the given number is kaprekar or not. A number if kaprekar if the representation of its square can be split into two parts that add up to the original number. For instance, 45 is a Kaprekar number, because 45^2 = 2025 and 20 + 25 = 45. Whereas 13 is not as 13^2 = 169 which can be split in two ways (1+69) and (16+9), but any of them is not 13. The number 1 is Kaprekar, because 1^2 = 01, and  0 + 1 = 1.

Input
First line of input will contain a number N = number of test cases. Next N lines will contain number n as test case where 0<=n<=9999.

Output
For each input case, print 1 if number is kaprekar and print 0 otherwise.

Sample Input
4
45
13
1
9

Sample Output
1
0
1
1
 */
import java.util.*;
public class KaprekarNo{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int test = S.nextInt();
        for(int i=0;i<test;i++){
            int n = S.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }if(n==1){
                System.out.println(1);
                continue;
            }
            int sq = n*n;
            int num = sq;
            boolean flag=false;
            int div = 10;
            while(div<=num){
                int a = num % div;
                int b = num/div;
                int sum =a+b;
                if(sum==n){
                    flag=true;
                    break;
                }
                div*=10;
            }
            if(flag){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        S.close();
    }
}