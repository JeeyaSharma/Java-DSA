package basics;

// Count digits in an Integer
public class Code_1 {
    private static int countDigits(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    private static int countDigitsRecursive(int n){
        if(n==0) return 0;

        return 1 + countDigitsRecursive(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(countDigits(n));
        System.out.println(countDigitsRecursive(n));
    }
}
