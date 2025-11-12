package recursion;
/*
Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, ”}”, ”(“, ”)”, ”[“, ”]” are correct in exp. 
Examples: 

Input : exp = “[()]{}{[()()]()}”
Output : true

Input : exp = “[(])”
Output : false
 */
public class Recursion_40 {
    private static char findClosing(char ch){
        if(ch == '(') return ')';
        if(ch == '[') return ']';
        if(ch == '{') return '}';
        return 0;
    }
    private static boolean isBalanced(String str){
        if(str.length()==0) return true;
        if(str.length()==1) return false;
        char first = str.charAt(0);
        if(first=='}'||first==']'||first==')') return false;

        char closing = findClosing(first);
        int count = 0;
        int i;
        for(i = 1;i<str.length();i++){
            if(str.charAt(i)==first) count++;
            else if(str.charAt(i)==closing){
                if(count==0) break;
                count--;
            }
        }
        if(i==str.length()) return false;
        String inside = str.substring(1, i);
        String remaining = str.substring(i+1);

        return isBalanced(inside) && isBalanced(remaining);
    }
    public static void main(String[] args){
        System.out.println(isBalanced("()"));
    }
}
