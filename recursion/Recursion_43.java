package recursion;

import java.util.ArrayList;
import java.util.List;

// Leetcode 216 Combination Sum 3
public class Recursion_43 {
    public static List<List<Integer>> combinationSum3(int k, int n){
        return helper(k, n, 1, new ArrayList<>());
    }
    private static List<List<Integer>> helper(int k, int n, int val, List<Integer> res){
        List<List<Integer>> ans = new ArrayList<>();
        if(k==0){
            if(n==0){
                ans.add(new ArrayList<>(res));
            }
            return ans;
        }
        if(val>9) return ans;
        res.add(val);
        ans.addAll(helper(k-1, n-val, val+1, res));
        res.remove(res.size()-1);
        ans.addAll(helper(k,n,val+1,res));
        return ans;
    }
    public static void main(String[] args){
        System.out.println(combinationSum3(3, 9));
    }
}
