// Input 2 numbers and find how many times the second digit is present in the first number
import java.util.*;
public class java_7_counting_occurrence{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=S.nextInt();
        System.out.print("Enter the target digit: ");
        int digit=S.nextInt();
        int count=0;
        while(num!=0){
            if(num%10==digit){
                count++;
            }
            num/=10;
        }
        System.out.print("No of times "+digit+" has occurred: "+count);
        S.close();
    }
}