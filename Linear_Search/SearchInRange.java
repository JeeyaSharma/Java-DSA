import java.util.*;
public class SearchInRange {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        System.out.println("Enter the Range: ");
        System.out.print("Starting Range- ");
        int start = S.nextInt();
        System.out.print("Ending Range- ");
        int end= S.nextInt();
        System.out.print("Enter target element: ");
        int target = S.nextInt();
        int index = -1;
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index== -1){
            System.out.println("Target is not in range");
        }else{
            System.out.println("Target is in range at index "+index);
        }
        S.close();
    }
}
