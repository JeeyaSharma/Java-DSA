/*
 Read as input 5 Numbers and print the largest out of them

Input Format
5 Space Separated Numbers (both positive and negative)

Sample Input
2 4 7 -2 3
Sample Output
7
Explanation
In the given case 7 is largest among the given numbers.
 */
import java.util.Scanner;
public class largest_of_5_nos {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]= S.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print(max);
        S.close();
    }    
}
