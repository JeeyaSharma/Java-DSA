package recursion;

// Leetcode-8 String to Integer
public class Recursion_51 {
    // Brute force solution
    private static int myAtoi(String str){
        int ans = 0;
        int sign = 1;
        boolean started = false;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!started && ch==' ') continue;
            if(!started && (ch=='-' || ch=='+')){
                sign = (ch=='-')? -1 : 1;
                started = true;
                continue;
            }
            if(!Character.isDigit(ch)) break;
            started = true;
            int digit = ch - '0';
            if(ans>Integer.MAX_VALUE/10 ||
                (ans == Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)
            ){
                return (sign==1) ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            ans = ans*10 + digit;
        }
        return ans;
    }
    // Recursive solution
    private static int myAtoiHelper(String str,int ans, int i,int sign, boolean started){
        if(i==str.length()) return ans*sign;
        char ch = str.charAt(i);
        if(!started && ch==' '){
            return myAtoiHelper(str, ans, i+1, sign, started);
        }
        if(!started && (ch=='-'||ch=='+')){
            sign = (ch=='-') ? -1 : 1;
            return myAtoiHelper(str,ans,i+1,sign,true);
        }
        if(!Character.isDigit(ch)){
            return ans * sign;
        }
        int digit = ch - '0';
        if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE/10)){
            return (sign==1) ? Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        ans = ans*10 + digit;
        return myAtoiHelper(str, ans, i+1, sign, true);
    }
    private static int helper(String str,int ans,int sign,boolean started){
        if(str.length()==0) return ans*sign;
        char ch = str.charAt(0);
        if(!started && ch==' ') return helper(str.substring(1), ans, sign, started);
        if(!started && (ch=='-'||ch=='+')) return helper(str.substring(1),ans,(ch=='-')?-1:1,true);
        if(!Character.isDigit(ch)) return ans*sign;
        int digit = ch-'0';
        if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)){
            return (sign==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        ans = ans*10 + digit;
        return helper(str.substring(1), ans, sign, true);
    }
    private static int myAtoi2(String str){
        return helper(str, 0, 1, false);
    }
    public static void main(String[] args){
        String str = "   -042";
        System.out.println(myAtoi2(str));
    }
}
