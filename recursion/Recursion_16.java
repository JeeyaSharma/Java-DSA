package recursion;

/*
Write a recursive function evenDigits that accepts an integer parameter n and returns a new integer containing only the even digits from n, in the same order. If n does not contain any even digits, return 0.

For example, the call of evenDigits(8342116) should return 8426 and the call of evenDigits(35179) should return 0.
 */
public class Recursion_16 {
    private static int evenDigits(int num){
        if(num==0) return 0;
        int lastDigit = num % 10;
        if(lastDigit % 2 == 0){
            return lastDigit + (evenDigits(num/10) * 10);
        }else{
            return evenDigits(num/10);
        }
    }
    public static void main(String[] args){
        System.out.println(evenDigits(35179));
    }
}
