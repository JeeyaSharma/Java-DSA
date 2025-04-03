/*
Given a list of integers with no duplicates, find out how many swaps it will take to sort the list in increasing order using Bubble sort.

Input Format:
First line of each test case will contain an integer T = number of test cases. Each test case will contain two lines. First line will contain a number N = no. of elements in the list. Next line will contain N space separated numbers.

Output Format:
For each test case, print on a single line, number of swaps required to sort the list in increasing order using Bubble sort.

Constraints:
1 <= T <= 10
1 <= N <= 50
0 <= arr[i] 
<= 10^9

Sample Input
3  // No. of test cases
5
2 1 4 6 3
10 
123 21 34 45 25 675 23 44 55 900
1
23

Sample Output
3
16
0
 */
import java.util.*;
public class NoOfSwapsInBubbleSort{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter no of test cases: ");
        int test = S.nextInt();
        for(int t=0;t<test;t++){
            System.out.print("Enter size of array: ");
            int n = S.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter array elements:");
            for(int i=0;i<n;i++){
                arr[i]=S.nextInt();
            }
            int swapCount=0;
            for(int i=0;i<n;i++){
                for(int j=1;j<n-i;j++){
                    if(arr[j]<arr[j-1]){
                        swapCount++;
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                }
            }
            System.out.println("Swap Count: "+swapCount);
        }
        S.close();
    }
}