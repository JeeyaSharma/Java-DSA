package backtracking;

/*
Given n-bits we can generate 2^n different strings from it. For example, with 3 bits we can generate 2^3=8 strings i.e. 000, 001, 010, 011, 100, 101, 110, 111.
You need to write a function to find all strings for a given number of bits.

Input Format:
First lines contains an integer denoting the number of bits

Output Format:
Print all strings for given number of bits in ascending order.

Sample Input
3
Sample Output
000
001
010
011
100
101
110
111
*/
public class Print_Binary_Strings {
    public static void printBinaryString(int n, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, str+"0");
        printBinaryString(n-1, str+"1");
    }
    public static void main(String[] args) {
        printBinaryString(3, "");
    }
}
