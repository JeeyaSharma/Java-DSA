/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.
 
Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 
Constraints:
1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length

Follow up:
Could you solve this problem in less than O(n) complexity?
 */
import java.util.*;
public class Leetcode_1539{
    public static int findKthPositive(int[] arr, int k){
        int newSize=arr.length+k;
        int[] newArr = new int[newSize];
        int num=1;
        for(int i=0;i<newSize;i++){
            newArr[i]=num;
            num++;
        }
        int k_num=0;
        int count=0;
        for(int i=0;i<newSize;i++){
            for(int j=count;j<arr.length;j++){
                if(newArr[i]==arr[j]){
                    continue;
                }else{
                    count++;
                    k_num=newArr[i];
                }
            }
            if(count==5) break;
        }

        return k_num;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=S.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k= S.nextInt();
        System.out.println("Ans: "+findKthPositive(arr, k));
        S.close();
    }
}