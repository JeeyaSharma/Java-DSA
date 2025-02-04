// To find Armstrong Number between two given number.
import java.util.*;
public class java_15_armstrong_between_2Nos{
    public static boolean is_armstrong(int n){
        int digits=(int)(Math.log10(n)+1);
        int num=n;
        int sum=0;
        while(num!=0){
            sum+=Math.pow(num%10,digits);
            num/=10;
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int num1=S.nextInt();
        int num2=S.nextInt();
        if(num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        for(int i=num1;i<=num2;i++){
            if(is_armstrong(i)){
                System.out.println(i);
            }
        }
        S.close();
    }
}