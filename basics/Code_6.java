package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Print all of the divisors of a number
public class Code_6 {
    // private static List<Integer> findDivisors(int n){
    //     List<Integer> ans = new ArrayList<>();
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0) ans.add(i);
    //     }
    //     return ans;
    // }
    private static int[] findDivisors(int n){
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0) ans.add(i);
        }
        int[] res = new int[ans.size()];
        int idx = 0;
        for(int ele:ans){
            res[idx] = ele;
            idx++;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(findDivisors(6)));
    }
}
