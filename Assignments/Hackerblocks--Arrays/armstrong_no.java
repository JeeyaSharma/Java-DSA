/*
 Take the following as input.
A number
Write a function which returns true if the number is an armstrong number and false otherwise, where Armstrong number is defined as follows.
A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.
abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….
1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4
371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

Input Format
Single line input containing an integer

Constraints
0 < N < 1000000000

Output Format
Print boolean output for each testcase.
"true" if the given number is an Armstrong Number, else print "false".

Sample Input
371
Sample Output
true
Explanation
Use functions. Write a function to get check if the number is armstrong number or not. Numbers are armstrong if it is equal to sum of each digit raised to the power of number of digits.
 */
// import java.util.Scanner;
// public class armstrong_no{
//     public static int noOfDigits(int n){
//         int count=0;
//         while(n!=0){
//             count++;
//             n/=10;
//         }
//         return count;
//     }
//     public static int power(int base,int exp){
//         int ans=1;
//         for(int i=0;i<exp;i++){
//             ans*=base;
//         }
//         return ans;
//     }
//     public static void main(String[] args){
//         Scanner S = new Scanner(System.in);
//         int n = S.nextInt();
//         int num = n;
//         int sum=0;
//         int digits=noOfDigits(n);
//         while(num!=0){
//             int rem=num%10;
//             sum+=power(rem,digits);
//             num/=10;
//         }
//         if(sum==n){
//             System.out.print("true");
//         }
//         else{
//             System.out.print("false");
//         }
//         S.close();
//     }
// }
import java.util.Scanner;
public class armstrong_no{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int num = n;
        int digits=0;
        int temp=n;
        while(temp!=0){
            digits++;
            temp/=10;
        }
        int sum=0;
        while(num!=0){
            sum+=Math.pow(num%10, digits);
            num/=10;
        }
        boolean flag=false;
        if(sum==n){
            flag=true;
        }
        System.out.print(flag);
        S.close();
    }
}