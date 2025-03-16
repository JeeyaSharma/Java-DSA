/*
Write a program to find the 2nd maximum element in an array.
Note: Print 0, if all the values are same.

Input Format:
The first line of input contains an integer N, denoting the size of array.
The second line contains N space separated integers, denoting the array elements.

Constraints:
  2 <= N <= 10^5
 -1000 <= arr[i] <= 1000
Output Format:

For each test case, print the 2nd maximum element in the list.

Sample Input 1
5
30 210 100 40 70
Sample Output 1
100

Sample Input 2
5
40 -20 50 40 10
Sample Output 2
40
 */
import java.util.*;
public class SecondMaxInArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        
        if(arr[0]==arr[size-1]){
            System.out.println(0);
        }else{
            int max = arr[size-1];
            int secondMax = arr[size-2];

            for(int i=size-2;i>=0;i--){
                if(arr[i]<max){
                    secondMax = arr[i];
                    break;
                }
            }
            System.out.println(secondMax);
        }

        input.close();
    }
}