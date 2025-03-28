import java.util.*;
public class String_Tokenizer {
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("My name is Jeeya"," ");
        int count_Tokens = st.countTokens();
        System.out.println(count_Tokens);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
