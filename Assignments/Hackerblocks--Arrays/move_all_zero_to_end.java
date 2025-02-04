/*
 Given an integer array, move all zeros present in it to the end. The solution should maintain the relative order of the items in the array and should not use the constant space.

Input Format
First line of input contains integer N, denoting the size of the array. Next line of input contains N space separated integers denoting the elements of the array.

Constraints
1<=N<=10^5

Output Format
Print the modified array in which all zeroes are moved to right.

Sample Input
9
6 0 8 2 3 0 4 0 1
Sample Output
6 8 2 3 4 1 0 0 0 
Explanation
In 6 8 2 3 4 1 0 0 0 the non-zero elements preserve their order while the 0 elements are moved to the right.
 */
import java.util.*;
public class move_all_zero_to_end{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int size=S.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j+1<size;j++){
                if(arr[j]==0 && arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        S.close();
    }
}