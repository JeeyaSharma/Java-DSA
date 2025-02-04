/*
 A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number.

Input Format
There will be only one line of input:N , the number which needs to be checked.

Constraints
1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)

Output Format
1 if the number is a Boston number. 0 if the number is a not Boston number.

Sample Input
378
Sample Output
1
Explanation
Self Explanatory
 */
import java.util.Scanner;
public class boston_numbers{
    public static int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        int digitSum=sumOfDigits(n);
        int factSum=0;
        int temp=n;
        for(int i=2;i*i<=n;i++){
            while(temp%i==0){
                factSum+=sumOfDigits(i);
                temp/=i;
            }
        }
        {
            if(temp>1){
                factSum+=sumOfDigits(temp);
            }
        }
        if(digitSum==factSum){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        S.close();
    }
}