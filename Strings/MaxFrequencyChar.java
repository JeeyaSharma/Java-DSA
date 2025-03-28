/*
Given a string S, the task is to identify the character that appears most frequently. It is guaranteed that only one character has the highest frequency.

Input Format
A single string S (1 ≤ |S| ≤ 100), consisting of lowercase and uppercase English letters.

Constraints
A string of length between 1 to 100.

Output Format
A single character that appears most frequently in the given string.

Sample Input
aaabacB
Sample Output
a
Explanation
Frequency of each character in the string:

'a' → 4 times
'b' → 2 times
'c' → 1 time
'B' → 1 time
Note: Since 'B' (uppercase) is different from 'b' (lowercase), they are counted separately.

The character with the highest frequency is 'a' (appearing 4 times).
 */
import java.util.*;
public class MaxFrequencyChar{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        char maxFreqChar=str.charAt(0);
        int maxfreq = 1;
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>maxfreq){
                maxfreq=count;
                maxFreqChar=str.charAt(i);
            }
        }
        System.out.println(maxFreqChar);
        S.close();
    }
}