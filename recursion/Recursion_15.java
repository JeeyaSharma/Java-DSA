package recursion;

/*
Write a program that accepts an integer n (where n >=2) and print all the prime factors of n using recursion.

Sample Input

24
Sample Output

2
2
2
3
Constraints : Do not declare any global variables. Do not use any loops; you must use recursion. You can declare as many primitive variables like ints as you like. You are allowed to define other "helper" functions if you like; they are subject to these same constraints.
 */
public class Recursion_15 {
    private static void printPrimeFactors(int num,int factor){
        if(num<2) return;
        if(num % factor == 0){
            System.out.println(factor);
            printPrimeFactors(num/factor, factor);
        }else{
            printPrimeFactors(num, factor+1);
        }
    }
    public static void main(String[] args){
        printPrimeFactors(24, 2);
    }
}
