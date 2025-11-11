package recursion;

/*
Given a string find its first uppercase letter
Examples : 

Input : geeksforgeeKs
Output : K

Input  : geekS
Output : S
 */

public class Recursion_35 {
    private static char first(String str, int idx){
        if(idx >= str.length()) return ' ';

        if(Character.isUpperCase(str.charAt(idx))){
            return str.charAt(idx);
        }else{
            return first(str, idx+1);
        }
    }
    public static void main(String[] args){
        System.out.println(first("geekS", 0));
    }
}
