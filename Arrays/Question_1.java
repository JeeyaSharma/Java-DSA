/*
input a 2D array and find the row and column indices of the element whose value is zero and the elements surrounding it are 1.
 */
import java.util.*;
public class Question_1{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter no of rows in 2D array: ");
        int rows = S.nextInt();
        System.out.print("Enter no of columns in 2D array: ");
        int cols = S.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter 2D array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=S.nextInt();
            }
        }
        for(int i=1;i<rows-1;i++){
            for(int j=1;j<cols-1;j++){
                if(arr[i][j]==0){
                    if(arr[i+1][j]==1 && arr[i][j+1]==1 && arr[i-1][j]==1 && arr[i][j-1]==1){
                        System.out.println(i+" "+j);
                        break;
                    }
                }
            }
        }
        S.close();
    }
}