import java.util.*;
public class MergeTwoSortedArrays{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Size of Array A: ");
        int sizeA=S.nextInt();
        System.out.print("Size of Array B: ");
        int sizeB=S.nextInt();
        int[] A = new int[sizeA];
        int[] B = new int[sizeB];
        int[] C = new int[sizeA+sizeB];
        System.out.println("Enter array A elements:");
        for(int i=0;i<sizeA;i++){
            A[i]=S.nextInt();
        }
        System.out.println("Enter Array B elements:");
        for(int i=0;i<sizeB;i++){
            B[i]=S.nextInt();
        }
        int i=0,j=0,k=0;
        while(i<sizeA && j<sizeB){
            if(A[i]<B[j]){
                C[k]=A[i];
                i++;
                k++;
            }else{
                C[k]=B[j];
                j++;
                k++;
            }
        }
        while(i<sizeA){
            C[k]=A[i];
            k++;
            i++;
        }
        while(j<sizeB){
            C[k]=A[j];
            k++;
            j++;
        }
        System.out.println("Merged Array: "+Arrays.toString(C));
        S.close();
    }
}