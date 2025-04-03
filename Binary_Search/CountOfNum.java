/*
Given a sorted list of integers with duplicates, find the count of a given number K in that list in O(log n) time.

Input
First line of input will contain a positive integer T = number of test cases. Each test case will contain 2 lines. 
First line of each test case will contain two number N = number of elements in list and K separated by space. 
Next line will contain N space separated integers.

Constraints
  1 <= N <= 10^5
 -(10^9) <= arr[i], K <= (10^9)

Output
For each test case, print on a single line, the count of number K in this list.

Sample Input
3  // Test Cases
10 5  // N K (testcase 1)
1 2 2 5 5 5 7 7 7 8
10 1  // N K (testcase 2)
1 1 1 1 1 1 1 2 2 3
20 2  // N K (testcase 3)
1 1 1 1 1 2 2 2 2 2 3 3 3 3 3 4 4 4 4 4

Sample Output
3
7
5
 */
import java.util.*;
public class CountOfNum{
    private static int findOccurrenceCount(int[] arr, int target){
        int startIndex=findCount(arr,target,true);
        int endIndex=findCount(arr,target,false);
        int totalCount=endIndex-startIndex+1;
        return totalCount;
    }
    private static int findCount(int[] arr, int target, Boolean startValue){
        int start=0,end=arr.length-1,index=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                index=mid;
                if(startValue){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
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
        int target=S.nextInt();
        System.out.println("Count of occurrence of target: "+findOccurrenceCount(arr,target ));
        S.close();
    }
}