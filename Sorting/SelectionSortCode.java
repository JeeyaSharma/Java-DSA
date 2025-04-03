import java.util.*;
public class SelectionSortCode {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        for(int i=0;i<n;i++){
            int lastElement=n-i-1;
            int maxIndex=0;
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[lastElement];
            arr[lastElement]=temp;
        }
        System.out.println(Arrays.toString(arr));
        S.close();
    }
}
