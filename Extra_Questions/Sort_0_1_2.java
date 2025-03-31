// Input an array and sort the zeros and ones in the array
import java.util.*;
public class Sort_0_1_2 {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = S.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count_0++;
            }
            else if(arr[i]==1){
                count_1++;
            }
            else if(arr[i]==2){
                count_2++;
            }
        }
        for(int i=0;i<n;i++){
            if(count_0>0){
                arr[i]=0;
                count_0--;
            }
            else if(count_1>0){
                arr[i]=1;
                count_1--;
            }
            else if(count_2>0){
                arr[i]=2;
                count_2--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        S.close();
    }
}
