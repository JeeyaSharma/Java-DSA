import java.util.Scanner;
import java.util.ArrayList;
public class MultiDimensionArrayList {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.print("Enter the number of ArrayLists inside ArrayList: ");
        int num=S.nextInt();
        // Initialising ArrayLists inside the the ArrayList
        for(int i=0;i<num;i++){
            list.add(new ArrayList<>());
        }

        System.out.print("Size of ArrayLists inside ArrayList: ");
        int size=S.nextInt();

        System.out.println("Add elements to ArrayList: ");
        for(int i=0;i<num;i++){
            for(int j=0;j<size;j++){
                list.get(i).add(S.nextInt());
            }
        }

        System.out.println("Multi-Dimensional ArrayList: "+list);
        S.close();
    }
}
