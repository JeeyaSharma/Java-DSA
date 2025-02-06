/*
Add one to each digit of a 4 digit bookmark_border
Write a program to add one to each digit of a 4 digit number. Ignore the carry digit.

Input
Each test case will contain a number n where 1000<=n<=9999.
Output
For each input case, add one to each digit of n, ignore the carry and print the new number.

Sample Input
1239

Sample Output
2340
*/
import java.util.*;
public class add_1_to_each_digit{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        int new_num=0;
        int cnt=1;
        while(n!=0){
            int r=n%10+1;
            if(r==10){
                r=0;
            }
            int i=1;
            while(i<cnt){
                r*=10;
                i++;
            }
            new_num+=r;
            n/=10;
            cnt++;
        }
        System.out.print(new_num);
        S.close();
    }
}