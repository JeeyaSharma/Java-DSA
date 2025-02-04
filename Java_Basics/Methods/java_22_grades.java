/* Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below: 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail  */
import java.util.*;
public class java_22_grades{
    public static void display_grades(int marks){
        if(marks>=91 && marks<=100){
            System.out.print("AA");
        }else if(marks>=81 && marks<=90){
            System.out.print("AB");
        }else if(marks>=71 && marks<=80){
            System.out.print("BB");
        }else if(marks>=61 && marks<=70){
            System.out.print("BC");
        }else if(marks>=51 && marks<=60){
            System.out.print("CD");
        }else if(marks>=41 && marks<=50){
            System.out.print("DD");
        }else{
            System.out.print("Fail");
        }
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=S.nextInt();
        System.out.print("Grade: ");
        display_grades(marks);
        S.close();
    }
}