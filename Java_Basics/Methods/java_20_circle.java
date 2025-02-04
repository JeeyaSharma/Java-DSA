// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.*;
public class java_20_circle{
    public static float circumference(float r){
        float c=2*(float)(Math.PI)*r;
        return c;
    }
    public static float area(float r){
        float a=(float)(Math.PI)*r*r;
        return a;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius=S.nextFloat();
        float circum=circumference(radius);
        System.out.printf("Circumference of circle: %.2f", circum);
        System.out.println();
        float area=area(radius);
        System.out.printf("Area of circle: %.2f",area);
        S.close();
    }
}