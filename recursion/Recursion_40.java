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
    private static boolean isBalanced(String str){
        return isBalancedHelper(str, 0, 0);
    }
    private static boolean isBalancedHelper(String str, int idx, int open){
        if(idx >= str.length()){
            if(open==0) return true;
            else return false;
        }
        if(str.charAt(idx) == '('||str.charAt(idx)=='['||str.charAt(idx)=='{') open++;
        else open--;

        return isBalancedHelper(str, idx+1, open);
    }
    public static void main(String[] args){
        System.out.println(isBalanced("[()]{}{[()()]()}"));
    }
}
