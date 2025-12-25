package basics;

// Find the GCD/HCF of two numbers
public class Code_4 {
    private static int gcd(int n1, int n2){
       if(n2==0) return n1;
       else return gcd(n2,n1%n2);
    }
    public static void main(String[] args){
        System.out.println(gcd(2,3));
    }
}
