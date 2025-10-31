package backtracking;

// Print the path and can only go in 2 directions right and down
public class RatInAMaze2 {
    private static void printPath(int startRow, int startCol, int endRow, int endCol, String str){
        if(startRow>endRow || startCol>endCol) return;
        if(startRow==endRow && startCol==endCol){
            System.out.println(str);
            return;
        }
        // Go Down
        printPath(startRow+1, startCol, endRow, endCol, str+"D");
        // Go Right
        printPath(startRow, startCol+1, endRow, endCol, str+"R");
    }
    public static void main(String[] args){
        int rows = 2;
        int cols = 2;
        printPath(1, 1, rows, cols, "");
    }
}
