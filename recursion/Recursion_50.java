package recursion;

import java.util.ArrayList;
import java.util.List;

// Find all the permutations of a string
public class Recursion_50 {
    private static void permuteHelper(String str,String res,int idx, List<String> ans){
        if(res.length()==str.length()){
            ans.add(res);
            return;
        }
        for(int i=0;i<str.length();i++){
            if(res.indexOf(str.charAt(i))!=-1) continue;
            permuteHelper(str, res+str.charAt(i), idx+1, ans);
        }
    }
    private static List<String> permute(String str){
        List<String> ans = new ArrayList<>();
        permuteHelper(str, "", 0, ans);
        return ans;
    }
    public static void main(String[] args){
        String str = "abc";
        System.out.println(permute(str));
    }
}
