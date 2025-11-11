package recursion;

/*
Given a number, we need to find sum of its digits using recursion.
Examples: 
Input: 12345
Output: 15
Explanation: Sum of digits → 1 + 2 + 3 + 4 + 5 = 15

Input: 45632
Output: 20 
 */

public class Recursion_38 {
    private static int sumOfDigits(int n){
        if(n == 0) return 0;

        return n%10+sumOfDigits(n/10);
    }
    public static void main(String[] args){
        System.out.println(sumOfDigits(12345));
    }
}
