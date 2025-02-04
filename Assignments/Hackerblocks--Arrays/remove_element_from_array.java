/*
You are given an integer N, an array of integers arr of size N and an integer target. You have to remove all occurrences of target in arr. The relative order of the elements should not be changed. Do not allocate extra space for another array. You must do solve this problem by modifying the input array in place.

Input Format
First line of input contains an integer N, followed by N space-separated integers in a separate line. The integer target is in the next line.

Constraints
0 <= N <= 100
0 <= arr[i] <= 50
0 <= target <= 100

Output Format
Print space-separated integers of arr without target.

Sample Input
4
3 2 2 3
3
Sample Output
2 2
Explanation
The output doesn’t contain the target value, i.e 3 in this case.
*/
import java.util.*;
public class remove_element_from_array{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int size=S.nextInt();
        int count=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        int target=S.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]!=target){
                count++;
            }
        }
        int[] new_arr=new int[count];
        S.close();
    }
}