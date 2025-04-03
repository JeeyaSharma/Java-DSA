/*
Given an array of integers, find the minimum number of rotations performed on some sorted array to create this given array.

Input
First line of input will contain a number T = number of test cases. Each test case will contain 2 lines. First line will contain a number N = number of elements in the array (1 <= N <= 50).
Next line will contain N space separated integers.
Complete the function int rotationCount(int array[], int size) which will receive array and size of the array as input and return how many times the sorted array is rotated. Function should return -1 if the array is not rotated.

Output
Print one line of output for each test case with the minimum number of rotations for given array.

Sample Input:
2
6
15 18 3 4 6 12
6
1 2 3 4 5 6

Sample Output
2
-1
 */
import java.util.*;
public class RotationCountOfSortedArray{
    private static int rotationCount(int[] arr,int n){
        int start=0,end=n-1;
        if(arr[start]<=arr[end]) return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(mid<n-1 && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            
            if(arr[mid] >= arr[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Size: ");
        int n = S.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        System.out.println("Rotation Count: "+rotationCount(arr, n));
        S.close();
    }
}