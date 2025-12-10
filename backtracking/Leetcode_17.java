package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode_17 {
    public static List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<String>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        solve(map, ans, digits, new StringBuilder(), 0);
        return ans;
    }
    private static void solve(HashMap<Character,String> map, List<String> ans, String digits, StringBuilder sb, int idx){
        if(idx>=digits.length()){
            if(sb.length()==digits.length()){
                ans.add(sb.toString());
            }
            return;
        }
        String letters = map.get(digits.charAt(idx));
       for(char ch: letters.toCharArray()){
            sb.append(ch);
            solve(map,ans,digits,sb,idx+1);
            sb.deleteCharAt(sb.length()-1);
       }
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("52"));
    }
}
