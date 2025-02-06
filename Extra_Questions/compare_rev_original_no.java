/*
Compare reverse and original number bookmark_border
Given an integer n, the task is to print 'Equal' if the integer is palidrome integer, else print 'Not Equal'
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Input Format:
First line of input will contain a number N = number of test cases.
Next N lines will contain number n as test case where 0<=n<=9999.

Output Format:
For each input case, compare reverse and original number and print “Equal” if they are equal and “ Not Equal” otherwise.

Sample Input
6
1234
456
12
1
0045
0

Sample Output
Not Equal
Not Equal
Not Equal
Equal
Not Equal
Equal
 */
import java.util.*;
public class compare_rev_original_no{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        for(int i=0;i<n;i++){
            int num=S.nextInt();
            int original=num;
            int rev=0;
            while(num!=0){
                int r=num%10;
                rev=rev*10+r;
                num/=10;
            }
            if(rev==original){
                System.out.println("Equal");
            }else{
                System.out.println("Not Equal");
            }
        }
        S.close();
    }
}