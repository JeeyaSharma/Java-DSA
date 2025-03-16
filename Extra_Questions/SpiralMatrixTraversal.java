/*
Spirally traversing a matrix bookmark_border
Traversing an array is an elementary operation on an array, in which each element will be processed for some operation. Printing elements is one example operation.

Complete the function printSpiral() given in the editor, which accepts a two dimensional array and prints the array in spiral form rotating clockwise.

Input Format
Each test-case will begin with two number m and n where m = no. of rows and n = no. of columns.
m rows will follow with n integers in each row separated by a space. 

Constraints
1<=m<=50 and 1<=n<=50.

Output Format
For each test case, print the elements of 2-d array in spiral form starting from index (0,0) or upper-left corner in clockwise direction.

Sample Input 1
3 3
4 5 6
7 8 9
10 11 12

Sample Output 1
4
5
6
9
12
11
10
7
8

Sample Input 2
3 4
4 3 2 1
5 7 8 11
2 4 6 8

Sample Output 2
4
3
2
1
11
8
6
4
2
5
7
8

 */
import java.util.*;
public class SpiralMatrixTraversal {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = S.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = S.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=S.nextInt();
            }
        }
        System.out.println("Entered Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Spiral Matrix:");
        for(int j=0;j<cols;j++){
            System.out.println(arr[0][j]);
        }
        for(int i=1;i<rows;i++){
            System.out.println(arr[i][cols-1]);
        }
        for(int j=cols-2;j>=0;j--){
            System.out.println(arr[rows-1][j]);
        }
        for(int j=0;j<cols-1;j++){
            System.out.println(arr[rows/2][j]);
        }
        S.close();
    }
}
