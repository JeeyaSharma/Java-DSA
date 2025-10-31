package backtracking;

public class RatInAMaze4 {
    private static void mazePath(int[][] arr,int startRow,int startCol,int endRow,int endCol,String str){
        if(startRow<0 || startCol<0) return;
        if(startRow>endRow || startCol>endCol) return;
        if(arr[startRow][startCol]==0) return;
        if(startRow == endRow && startCol==endCol){
            System.out.println(str);
            return;
        }
        arr[startRow][startCol] = 0;
        // Go Right
        mazePath(arr, startRow, startCol+1, endRow, endCol, str+"R");
        // Go Down
        mazePath(arr, startRow+1, startCol, endRow, endCol, str+"D");
        // Go Left
        mazePath(arr, startRow, startCol-1, endRow, endCol, str+"L");
        // Go Up
        mazePath(arr, startRow-1, startCol, endRow, endCol, str+"U");
        // Backtracking
        arr[startRow][startCol] = 1;
    }
    public static void main(String[] args){
        int[][] arr = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        mazePath(arr, 0, 0, 3, 3, "");
    }
}
