/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

Example 3:
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 

Constraints:
2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.
 */
import java.util.*;
public class Leetcode_744{
    public static char nextGreatestLetter(char[] letters,char target){
        int start=0,end=letters.length-1;
        char greater=letters[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                greater=letters[mid];
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return greater;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = S.nextInt();
        char[] arr = new char[size];
        System.out.print("Enter char array elements:");
        for(int i=0;i<size;i++){
            arr[i]=S.next().charAt(0);
        }
        System.out.print("Enter target char: ");
        char target = S.next().charAt(0);
        System.out.println("Next Greater Char aftr target: "+nextGreatestLetter(arr, target));
        S.close();
    }
}