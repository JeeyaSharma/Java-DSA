/*
 Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

Input Format
The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

Constraints
Length of the arrays should be between 1 and 1000.

Output Format
Print all the pairs of numbers which sum to target. Print each pair in increasing order.

Sample Input
5
1
3
4
2
5
5
Sample Output
1 and 4
2 and 3
Explanation
Find any pair of elements in the array which has sum equal to target element and print them.
 */
import java.util.*;
public class target_sum_pairs{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int size=S.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        int target=S.nextInt();
        for(int i=0;i<size;i++){
            for(int j=0;j+1<size;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.println(arr[i]+"\t"+"and"+"\t"+arr[j]);
                }
            }
        }
        S.close();
    }
}