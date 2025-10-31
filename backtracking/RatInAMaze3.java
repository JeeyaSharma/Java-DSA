package backtracking;

// Print the Path for 4 directions
public class RatInAMaze3 {
   public static void main(String[] args){
    int rows = 3;
    int cols = 3;
    boolean[][] isVisited = new boolean[rows][cols];
    printPath(0, 0, rows-1, cols-1, "", isVisited);
   }
   private static void printPath(int startRow,int startCol,int endRow,int endCol,String str,boolean[][] isVisited){
        if(startRow<0 || startCol<0) return;
        if(startRow>endRow || startCol>endCol) return;
        if(isVisited[startRow][startCol]==true) return;
        if(startCol==endCol && startRow==endRow){
            System.out.println(str);
            return;
        }

        isVisited[startRow][startCol] = true;
        // Go Right
        printPath(startRow, startCol+1, endRow, endCol, str+"R", isVisited);
        // Go Down
        printPath(startRow+1, startCol, endRow, endCol, str+"D", isVisited);
        // Go Left
        printPath(startRow, startCol-1, endRow, endCol, str+"L", isVisited);
        // Go Up
        printPath(startRow-1, startCol, endRow, endCol, str+"U", isVisited);
        // Backtracking
        isVisited[startRow][startCol] = false;
   }
}
