/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 
Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

Constraints:
0 <= x <= 231 - 1
 */
import java.util.*;
public class Leetcode_69{
    private static int findSQRT(int n){
        int start=0,end=n;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            long sq=mid*mid;
            if(sq == n) return mid;
            else if(sq > n) end = mid-1;
            else if(sq<n){ 
                start=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = S.nextInt();
        System.out.println("Square root of "+n+" : "+findSQRT(n));
        S.close();
    }
}