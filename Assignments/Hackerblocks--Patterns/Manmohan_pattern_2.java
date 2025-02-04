/*
 Help Manmohan to print pattern of a given number. See the output pattern for given input n = 5.
Input Format
Single integer N denoting number of lines of the pattern.

Constraints
N<=1000

Output Format
Pattern.

Sample Input
5
Sample Output
1
11
202
3003
40004
Explanation
If row number is n (>1), total character is n. First and last character is n-1 and rest are 0.
 */
import java.util.Scanner;
public class Manmohan_pattern_2 {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==0){
                    System.out.print("1");
                }
                else if(j==0 || j==i){
                    System.out.print(i);
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        S.close();
    }
}
