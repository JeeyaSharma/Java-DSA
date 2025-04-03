/*
Given a sorted list of N integers, find all distinct pairs of integers in the list with sum equal to a given number K, with O(n log n) or O(n) time complexity.
Complete the function below which takes the array and K as parameters and return the number of pairs if any and 0 otherwise.

Input Format:
First line of input will contain a positive integer T = number of test cases. Each test case will contain 2 lines.
First line of each test case contains two integers - N and K. 
Next line will contain N numbers separated by space in non-decreasing order.

Constraints:
1 ≤ T ≤ 10
1 ≤ N ≤ 10^5
-(10^9) ≤ arr[i], K ≤ 10^9

Output Format:
For each test case, print number of distinct pairs whose sum will be equal to k. A pair must have two numbers at different indices. 
Two pairs are different if at least one of the indices in them is uncommon. Indices - (2,3) and (3,2) are not distinct, but (2,3) and (2,4) are.

Sample Input
3  // Test Cases
10 11  // N K (testcase 1)
1 2 3 4 5 6 7 8 9 10
5 10   // N K (testcase 2)
2 4 6 8 10
6 27   // N K (testcase 3)
12 15 20 22 34 36

Sample Output
5
2
1
 */
import java.util.*;
public class FindAllPairsWithSumK{
    private static int getPairsCount(int[] arr, int k){
        int start=0, end=arr.length-1,count=0;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==k){
                count++;
                start++;
                end--;
                while(start<end && arr[start]==arr[start+1]) start++;
                while(start<end && arr[end]==arr[end-1]) end--;
            }
            else if(sum>k){
                end--;
            }
            else if(sum<k){
                start++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = S.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        System.out.print("Enter value of K: ");
        int k = S.nextInt();
        System.out.println("No of pairs: "+getPairsCount(arr, k));
        S.close();
    }
}