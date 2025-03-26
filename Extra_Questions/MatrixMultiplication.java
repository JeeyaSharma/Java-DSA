/*
Given two matrices A and B in the form of two dimensional arrays, find the dot product of these two matrices.

Input Format:
First line of input will contain an integer T = no. of test cases.
Each test case will follow in multiple lines. First line of each test case will contain two integers R1 = no. of rows in matrix A and C1 = no. of columns in matrix A. Next R1 lines will each contain C1 space separated integers. Next line again contain two integers R2 = no. of rows in B and C2 = no. columns in B. C1 will be equal to R2.

Output Format:
For each test case print matrix of size R1*C2 in R1 lines with each line containing C2 space separated integers of corresponding row.

Constraints
1 <= T <= 1000
1 <= R1, C1, R2, C2 <= 50
C1 will be equals to R2

Sample Input
2  // Test Cases
2 3    // R1 C1 (testcase 1)
1 2 3  // matrix A
4 5 6
3 2    // R2 C2
2 3    // matrix B
1 2
2 1
2 2    // R1 C1 (testcase 2)
12 4   // matrix A
7 6
2 3    // R2 C2
2 4 6  // matrix B
3 5 7

Sample Output
10 10  // A * B (testcase 1)
25 28
36 68 100  // A * B (testcase 2)
32 58 84
 */
import java.util.*;
public class MatrixMultiplication{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);

        System.out.print("Enter no of test cases: ");
        int test = S.nextInt();
        for(int t=0;t<test;t++){
            System.out.println("Matrix 1:");
            System.out.print("No of rows: ");
            int R1 = S.nextInt();
            System.out.print("No of columns: ");
            int C1 = S.nextInt();
            System.out.println("Enter Matrix 1 elements:");
            int[][] matrix1 = new int[R1][C1];
            for(int i=0;i<R1;i++){
                for(int j=0;j<C1;j++){
                    matrix1[i][j]=S.nextInt();
                }
            }

            System.out.println("Matrix 2:");
            System.out.print("No of rows: ");
            int R2 = S.nextInt();
            System.out.print("No of columns: ");
            int C2 = S.nextInt();
            System.out.println("Enter Matrix 2 elements:");
            int[][] matrix2 = new int[R2][C2];
            for(int i=0;i<R2;i++){
                for(int j=0;j<C2;j++){
                    matrix2[i][j] = S.nextInt();
                }
            }

            // New Matrix of size: R1,C2
            int[][] arr = new int[R1][C2];
            for(int i=0;i<R1;i++){
                for(int j=0;j<C2;j++){
                    arr[i][j]=0;
                    for(int k=0;k<C1;k++){
                        arr[i][j]+= matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Matrix Multiplication:");
            for(int i=0;i<R1;i++){
                for(int j=0;j<C2;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        S.close();
    }
}