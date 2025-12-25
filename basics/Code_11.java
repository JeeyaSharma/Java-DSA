package basics;

// basic recursion
// sum of 1st n numbers
public class Code_11 {
    private static int sum(int n){
        if(n<=0) return 0;

        return n + sum(n-1);
    }
    public static void main(String[] args){
        System.out.println(sum(10));
    }
}
