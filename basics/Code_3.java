package basics;

// Check if a number is palindrome or not  Leetcode 9
public class Code_3 {
    private static boolean isPalindrome(int n){
        String str = String.valueOf(n);
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    private static boolean isPalindromeRecursive(int n){
        String str = String.valueOf(n);
        return helper(str, 0, str.length()-1);
    }
    private static boolean helper(String str, int start, int end){
        if(start>=end) return true;
        if(str.charAt(start)!=str.charAt(end)) return false;
        return helper(str,start+1,end-1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindromeRecursive(121));
    }
}
