//Take 3 integer input from the keyboard and find the largest numbers among them

// Approach-1
// import java.util.*;
// public class java_4_largest_of_3_nos{
//     public static void main(String[] args){
//         Scanner S = new Scanner(System.in);
        
//         System.out.print("Enter first number: ");
//         int num1=S.nextInt();

//         System.out.print("Enter second number: ");
//         int num2=S.nextInt();

//         System.out.print("Enter third number: ");
//         int num3=S.nextInt();

//         int max=num1;
//         if(max<num2){
//             max=num2;
//         }
//         if(max<num3){
//             max=num3;
//         }
//         System.out.print("Largest number: "+max);
//         S.close();
//     }
// }

// Approach-2
// import java.util.*;
// public class java_4_largest_of_3_nos{
//     public static void main(String[] args){
//         Scanner S = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1=S.nextInt();
//         System.out.print("Enter second number: ");
//         int num2=S.nextInt();
//         System.out.print("Enter third number: ");
//         int num3=S.nextInt();
//         int max=0; 
//         if(num1>num2){
//             max=num1;
//         }else{
//             max=num2;
//         }
//         if(num3>max){
//             max=num3;
//         }
//         System.out.print("Largest number: "+max);
//         S.close();
//     }
// }

// Approach-3
import java.util.*;
public class java_4_largest_of_3_nos{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=S.nextInt();
        System.out.print("Enter second number: ");
        int num2=S.nextInt();
        System.out.print("Enter third number: ");
        int num3=S.nextInt();
        int max=Math.max(num1,Math.max(num2,num3));
        System.out.print("Largest number: "+max);
        S.close();
    }
}