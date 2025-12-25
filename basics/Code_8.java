package basics;

// basic recursion - 1
// Print name n times
public class Code_8 {
    private static void printName(String str, int n){
        if(n<=0) return;
        System.out.println(str);
        printName(str, n-1);
    }
    public static void main(String[] args){
        printName("Name", 5);
    }
}
