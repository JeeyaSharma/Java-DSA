import java.util.*;
public class GoodSubstrings {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        int maxLen=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== 'a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
                maxLen=Math.max(maxLen,count);
            }else{
                count=0;
            }
        }
        System.out.println(maxLen);
        S.close();
    }    
}
