import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList_Input_Output {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements to be added in the ArrayList: ");
        int size=S.nextInt();

        System.out.println("Enter ArrayList Elements: ");
        for(int i=0;i<size;i++){
            list.add(S.nextInt());
        }

        System.out.println("Entered Elements in ArrayList: ");
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }

        System.out.println("ArrayList: "+list);
        S.close();
    }
}
