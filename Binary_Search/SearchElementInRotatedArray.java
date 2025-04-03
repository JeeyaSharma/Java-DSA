/*
Given an array of n integers which is sorted but rotated by some number of times after sorting, and a integer k. Search the element k in this sorted rotated array efficiently. For example, suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
Assume there are no duplicate elements in the array.
Expected Time Complexity: O(log(N))
Expected Space Complexity: O(1)

Input Format
First line of input will contain a number T = number of test cases. Each test case will contain 3 lines. The first line will contain an integer k to be searched. Second line will contain a number n = number of elements in the array. Next line will contain N space separated integers. 
Complete the function int searchRotatedSortedArray() to search a value target in array a of size given, and if target found in the array return its index, otherwise return -1.
You may assume no duplicate exists in the array.

Output Format
Print the index of k in given array for each test case in new line if found and print -1 if k is not present in given array.

Constraints
  1 <= T <= 10
 -1000 <= k <= 1000
  1 <= n <= 10^5
 -1000 <= arr[i] <= 1000

Sample Input
2   // Test Cases
3               // k (testcase 1)
6               // n  
15 18 2 3 6 12  // arr[]
7               // k (testcase 2)
7               // n 
4 5 8 9 1 2 3   // arr[]

Sample Output
3
-1
 */
import java.util.*;
public class SearchElementInRotatedArray{
    private static int elementIndex(int[] arr, int n, int target){
        int start=0,end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(arr[mid]<=arr[end]){
                if(target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int target=S.nextInt();
        int n = S.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        System.out.println(elementIndex(arr, n, target));
        S.close();
    }
}