/*
Floor of a number is the greatest number smaller than or equal to target in an array
Find the floor of the target
Array is sorted
Take care for both asc and desc arrays
 */

 import java.util.*;
 public class FloorOfNum{
    static int FindFloor(int[] arr, int target){
        
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]= S.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = S.nextInt();
        S.close();
    }
 }