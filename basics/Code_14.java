package basics;
// check if a string is a palidrome or not
// Leetcode 125
public class Code_14 {
    private static boolean isPalindrome(String str){
        if(str.length()==1) return true;
        int i=0;
        int j = str.length()-1;
        while(i<j){
            char ch_i = str.charAt(i);
            char ch_j = str.charAt(j);
            if(!Character.isLetterOrDigit(ch_i)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch_j)){
                j--;
                continue;
            }
            if(Character.toLowerCase(ch_i)!=Character.toLowerCase(ch_j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
