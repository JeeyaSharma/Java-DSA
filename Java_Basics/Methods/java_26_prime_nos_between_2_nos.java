// Write a function that returns all prime numbers between two given numbers.
import java.util.*;
public class java_26_prime_nos_between_2_nos{
    public static void primeNos(int a, int b){
        for(int i=a;i<=b;i++){
            if(i<2){
                continue;
            }
            boolean flag=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int num1=S.nextInt();
        int num2=S.nextInt();
        primeNos(num1, num2);
        S.close();
    }
}