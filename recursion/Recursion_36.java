package recursion;

/*
Given a string calculate length of the string using recursion. 
Examples: 

Input: str = "abcd"
Output: 4
Explanation: The string "abcd" has a length of 4.

Input: str = "GEEKSFORGEEKS"
Output: 13
 */

public class Recursion_36 {
    private static int findLength(String str){
        if(str.equals("")){
            return 0;
        }
        return findLength(str.substring(1)) + 1;
    }
    public static void main(String[] args){
        System.out.println(findLength("Jeeya"));
    }
}
