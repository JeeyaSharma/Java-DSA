//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
public class java_12_calculator{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1=S.nextInt();
        int num2=S.nextInt();
        System.out.print("Enter an operator: ");
        char op=S.next().trim().charAt(0);
        
        if(op == '+'){
            System.out.print("Answer: "+(num1+num2));
        }else if(op == '-'){
            System.out.print("Answer: "+(num1-num2));
        }else if(op == '*'){
            System.out.print("Answer: "+(num1*num2));
        }else if(op == '%'){
            System.out.print("Answer: "+(num1%num2));
        }else if(op == '/'){
            if(num2!=0){
                System.out.print("Answer: "+(num1/num2));
            }else{
                System.out.print("Not defined as zero is the denominator.");
            }
        }else{
            System.out.print("Enter a valid operator");
        }
        S.close();
    }
}