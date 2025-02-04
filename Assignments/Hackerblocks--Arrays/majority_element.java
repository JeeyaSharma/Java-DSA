/*
 Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
You may assume that the array is non-empty and the majority element always exist in the array.

Input Format
First line contains integer N (size of the array) followed by N more integers.

Output Format
Majority Element of array

Sample Input
3
1 1 2
Sample Output
1
Explanation
Number of 1's in the array is more than 3/2 , Hence majority element is 1
 */
// import java.util.Scanner;
// public class majority_element{
//     public static void main(String[] args){
//         Scanner S = new Scanner(System.in);
//         int n = S.nextInt();
//         int[] arr= new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=S.nextInt();
//         }
//         int majority=0;
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=0;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             if(count>n/2){
//                 majority=arr[i];
//             }
//         }
//         System.out.print(majority);
//         S.close();
//     }
// }
import java.util.Scanner;
public class majority_element{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int size=S.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j+1<size;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print(arr[size/2]);
        S.close();
    }
}