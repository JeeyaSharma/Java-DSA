// Make a calculator which will keep on asking to input an operator and numbers to perform operation with until X or x is entered
import java.util.*;
public class java_9_infinite_calculator{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.println("Enter X or x to exit this loop.");
            System.out.print("Enter an operator: ");
            char op=S.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.print("Enter two numbers: ");
                int num1=S.nextInt();
                int num2=S.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                else if(op=='-'){
                    ans=num1-num2;
                }
                else if(op=='*'){
                    ans=num1*num2;
                }
                else if(op=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }
                else if(op=='%'){
                    ans=num1%num2;
                }
            }else if(op=='X' || op=='x'){
                break;
            }else{
                System.out.println("Invalid Input!");
            }
            System.out.println("Answer: "+ans);
        }
        S.close();
    }
}