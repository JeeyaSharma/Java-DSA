/*
 Sort just 0 and 1

Input Format
A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space

Constraints
N will not exceed 10^7

Output Format
Sorted Sequence

Sample Input
7
1 0 0 1 1 0 1
Sample Output
0 0 0 1 1 1 1
 */
import java.util.*;
public class sort_zero_one{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int size=S.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        int zero_count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                zero_count++;
            }
        }
        for(int i=0;i<zero_count;i++){
            System.out.print(0+"\t");
        }
        for(int i=0;i<size-zero_count;i++){
            System.out.print("1"+"\t");
        }
        S.close();
    }
}