/*
 Take the following as input.

A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

Constraints
0 < N1 < 100 0 < N2 < 100

Sample Input
10 
4
Sample Output
5 
11 
14 
17 
23 
26 
29 
35 
38 
41
Explanation
The output will've N1 terms which are not divisible by N2.
 */
import java.util.Scanner;
public class print_series {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n1=S.nextInt();
        int n2=S.nextInt();
        int terms=0;
        int i=1;
        while(terms<n1){
            int num=3*i+2;
            if(num%n2!=0){
                System.out.println(num);
                terms++;
            }
            i++;
        }
        S.close();
    }
}
