/*
Given a sorted list of integers, find the position of first occurrence of a given number K in the list in O(log n) time.

Input Format:
First line of input will contain a positive integer T = number of test cases.
Each test case will contain the following two lines:
  First line will contain two positive integer N = number of elements in list and K.
  Second line will contain N space separated integers in increasing order.

Constraints:
  1 <= N <= 10^5
 -(10^9) <= arr[i], K <= (10^9)

Output Format:
For each test case, print on a single line the index of first occurrence of K in the list on 0-based index. Print -1 if you cannot find K in the list.

Sample Input
3  // Test Cases
10 4  // N K (testcase 1)
1 2 4 4 4 4 5 8 9 10
15 7  // N K (testcase 2)
1 2 3 3 5 6 7 7 7 7 7 8 8 8 8
9 1   // N K (testcase 3)
-5 -4 -3 -2 -1 0 0 0 1

Sample Output
2
6
8
 */
import java.util.*;
public class FirstOccurrenceOfInteger{
    private static int findFirstOccurrence(int[] arr, int target){
        int start=0,end=arr.length-1,index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                index=mid;
                end=mid-1;
            }
        }
        return index;
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
        System.out.print("Enter target value: ");
        int target=  S.nextInt();
        System.out.println("First occurrence of target: "+findFirstOccurrence(arr, target));
        S.close();
    }
}