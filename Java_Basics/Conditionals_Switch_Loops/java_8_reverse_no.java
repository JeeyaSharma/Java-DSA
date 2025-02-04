// Take a number as an input and output its reverse
import java.util.*;
public class java_8_reverse_no{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int num=S.nextInt();
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.print("Reverse number: "+rev);
        S.close();
    }
}