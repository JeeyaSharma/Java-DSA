package recursion;

// Check if a string is palindrome or not using recursion
public class Recursion_11 {
    private static boolean isPalindrome(String str,int i){
        if(i >= str.length()/2) return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;

        return isPalindrome(str, i+1);
    }
    public static void main(String[] args){
        String str = "racecar";
        System.out.println(isPalindrome(str, 0));
    }
}
