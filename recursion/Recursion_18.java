package recursion;

/*
Write a recursive function gcd that accepts two positive non-zero integer parameters i and j and returns the greatest common divisor of these numbers.

Sample Input
2 // Test Cases
30 18  // i j (testcase 1)
11 17  // i j (testcase 2)﻿

Sample Output
6
1
Constraints:. Solve the problem recursively.
 */
public class Recursion_18 {
    private static int gcd(int i, int j){
        if(j == 0) return i;
        return gcd(j,i%j);
    }
    public static void main(String[] args){
        System.out.println(gcd(30, 18));
    }
}
