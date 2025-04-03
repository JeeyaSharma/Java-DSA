import java.util.*;
public class InsertionSwapCode{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        S.close();
    }
}