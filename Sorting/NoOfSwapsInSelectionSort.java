/*
Write a program to count the number of swaps required to sort a given list of integers in ascending order using the selection sort algorithm.

Input Format:
First line of the input contains the number of test cases T. T test cases follow. The first line of each test case contains the N, the number of integers in the array. The second line contains N space separated integers. All N numbers are distinct.

Output Format:
For each test case, print on one line, the number of swaps (minimum) to sort the given array in ascending order using selection sort.

Constraints:
  1 <= T <= 10
  1 <= N <= 50
 -1000 <= arr[i] <= 1000
 
Sample Input
2  // No. of test cases
3
4 2 5
5
10 11 8 7 1

Sample Output
1
3
 */
import java.util.*;
public class NoOfSwapsInSelectionSort{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        int swapCount=0;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(i != minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
                swapCount++;
            }
        }
        System.out.println(swapCount);
        S.close();
    }
}