package basics;

// basic recursion - 2
// print 1 to n
public class Code_9 {
    private static void print1toN(int n){
        if(n==0) return;
        print1toN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        print1toN(5);
    }
}
