// Input currency in rupees and output in USD.
import java.util.*;
public class java_13_ind_currency_to_US{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ");
        float n=S.nextFloat();
        System.out.printf("USD: $%.2f",(n/86.21));
        S.close();
    }
}