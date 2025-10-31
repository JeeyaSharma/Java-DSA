package recursion;

// Reverse a String using recursion
public class Recursion_10 {
    private static String reverse(String str,String rev,int i){
        if(i < 0) return rev;

        return reverse(str, rev+str.charAt(i), i-1);
    }
    public static void main(String[] args){
        String str = "jeeya";
        System.out.println(reverse(str, "", str.length()-1));
    }
}
