import java.util.*;
public class SearchIn2DArray {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter no of rows in 2D array: ");
        int rows = S.nextInt();
        System.out.print("Enter no of columns in 2D array: ");
        int cols = S.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter 2D Array Elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=S.nextInt();
            }
        }
        System.out.print("Enter target: ");
        int target = S.nextInt();
        int targetRow=-1;
        int targetCol=-1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==target){
                    targetRow=i;
                    targetCol=j;
                    break;
                }
            }
            if(targetRow> -1){
                break;
            }
        }
        System.out.println("Target is at row "+targetRow+" in column "+targetCol);
        S.close();
    }
}
