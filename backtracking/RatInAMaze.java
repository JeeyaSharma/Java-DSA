package backtracking;

// Can only go in 2 directions, right or down
public class RatInAMaze {
    private static int mazePath(int startRow, int startCol, int endRow, int endCol){
        if(startRow>endRow || startCol>endCol) return 0;
        if(startRow == endRow && startCol == endCol) return 1;
        int rightWays = mazePath(startRow, startCol+1, endRow, endCol);
        int downWays = mazePath(startRow+1, startCol, endRow, endCol);
        return rightWays + downWays;
    }
    public static void main(String[] args){
        int rows = 3;
        int cols = 4;
        System.out.println(mazePath(1, 1, rows, cols));
        
    }
}
