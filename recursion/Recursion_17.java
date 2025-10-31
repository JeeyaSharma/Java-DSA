package recursion;

/*
Write a recursive function decimalToBinary that accepts an integer as a parameter and returns an integer whose digits look like that number's representation in binary (base-2). For example, the call of decimalToBinary(43) should return 101011.

Constraints: Do not use a string in your solution. Also do not use any built-in base conversion functions from the system libraries. solve the problem recursively.

Sample Input :
1 // no. of testcases
43

Sample Output :
101011
 */
public class Recursion_17 {
    private static int decimalToBinary(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        return (num%2) + (decimalToBinary(num/2)*10);
    }
    public static void main(String[] args){
        System.out.println(decimalToBinary(43));
    }    
}
