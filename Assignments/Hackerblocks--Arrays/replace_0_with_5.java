/*
 Given an integer N, now you have to convert all zeros of N to 5.

Input Format
The first Line takes input integer N, denoting the number.

Constraints
1<=N<=10000

Output Format
Print the number after replacing all 0's with 5.

Sample Input
103
Sample Output
153
Explanation
Testcase 1: after replacing 0 with 5 ,number will become 153.
Testcase 2: there is no zero in number so it will remain same.
 */
import java.util.*;
public class replace_0_with_5{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        int digits=(int)Math.log10(n)+1;
        int[] arr=new int[digits];
        int a=0;
        while(n!=0){
            arr[a]=n%10;
            n/=10;
            a++;
        }
        for(int i=0;i<digits;i++){
           if(arr[i]==0){
            arr[i]=5;
           }
        }
        int num=0;
        for(int i=digits-1;i>=0;i--){
            num=num*10+arr[i];
        }
        System.out.print(num);
        S.close();
    }
}