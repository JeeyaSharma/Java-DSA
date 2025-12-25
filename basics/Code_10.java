package basics;
// basic recursion - 3
// print n to 1
public class Code_10 {
    private static void printNto1(int n){
        if(n<=0) return;
        System.out.println(n);
        printNto1(n-1);
    }
    public static void main(String[] args){
        printNto1(5);
    }
}
