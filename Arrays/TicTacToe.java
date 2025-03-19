/*
Take an integer input n and then take input of n X n 2D- Character Array. Output the result of the 2D array of a valid tic-tac-toe game: Draw/ 'O' / 'X'
 */
import java.util.*;
public class TicTacToe{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = S.nextInt();
        char[][] arr = new char[n][n];
        System.out.println("Enter 'O' or 'X':");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=S.next().charAt(0);
            }
        }
        ticTacToeGame(arr);
        S.close();
    }

    static void ticTacToeGame(char[][] arr){
        // Vertical Wins
        for(int i=0;i<arr.length;i++){
            char first=arr[0][i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j][i]==first){
                    count++;
                }
            }
            if(count == arr.length){
                System.out.println(first);
                return;
            }
        }

        // Horizontal Wins
        for(int i=0;i<arr.length;i++){
            char first = arr[i][0];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==first){
                    count++;
                }
            }
            if(count==arr.length){
                System.out.println(first);
                return;
            }
        }

        // Diagonal Wins
        char first_diagonal = arr[0][0];
        char second_diagonal=arr[0][arr.length-1];
        int first_count=0;
        int second_count=0;
        for(int i=0;i<arr.length;i++){
            
                if(first_diagonal==arr[i][i]){
                    first_count++;
                }
                if(second_diagonal==arr[i][arr.length-i-1]){
                    second_count++;
                }
            
            if(first_count==arr.length){
                System.out.println(first_diagonal);
                return;
            }
            if(second_count==arr.length){
                System.out.println(second_diagonal);
                return;
            }
        }

        // Draw
        System.out.println("DRAW");
        return;
    }
}