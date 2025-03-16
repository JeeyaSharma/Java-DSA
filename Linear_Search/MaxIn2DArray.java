import java.util.*;
public class MaxIn2DArray {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter no of rows in 2D Array: ");
        int rows = S.nextInt();
        System.out.print("Enter no of cols in 2D Array: ");
        int cols = S.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter 2D Array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=S.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max Element: "+max);
        S.close();
    }
}
