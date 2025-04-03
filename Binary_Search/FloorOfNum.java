/*
Floor of a number is the greatest number smaller than or equal to target in an array
Find the floor of the target
Array is sorted
Take care for both asc and desc arrays
 */

 import java.util.*;
 public class FloorOfNum{
    static int findFloor(int[] arr, int target){
        int start=0,end=arr.length-1,floor=-1;

        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(isAsc){
                if(arr[mid]<target){
                    start=mid+1;
                    floor=arr[mid];
                }
                else if(arr[mid]>target){
                    end=mid-1;
                }
            }else{
                if(arr[mid]>target){
                    start=mid+1;
                }else if(arr[mid]<target){
                    floor=arr[mid];
                    end=mid-1;
                }
            }
            
        }
        return floor;
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
        System.out.println("Floor of target: "+findFloor(arr, target));
        S.close();
    }
 }