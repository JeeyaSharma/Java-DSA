package backtracking;

// import java.util.ArrayList;
// import java.util.List;

public class NQueens {
    private static void nQueens(int n, int col, String[][] ans){
        if(col>=n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        }
        for(int i=0;i<n;i++){

        }
    }
    private static boolean isSafe(String[][] ans, int row,int col, int n){
        // Col up
        for(int i=0;i<row;i++){
            if("Q".equals(ans[i][col])) return false;
        }
        // Upper left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if("Q".equals(ans[i][j])) return false;
        }
        // Upper right diagonal
        for(int )
    }
}
