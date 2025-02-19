import java.util.ArrayList; 

public class ArrayLists_1 {
    public static void main(String[] args){
        ArrayList <Object> List = new ArrayList<>();

        System.out.println("Adding Elements to the list named 'List' using add(object O) method");
        List.add("Jeeya");
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        System.out.println("List after adding elements: "+List);

        System.out.println("Adding 0 at index 1 in List using add(index,object) method");
        List.add(1,0);
        System.out.println("List after adding elements: "+List);

        ArrayList <Integer> List2 = new ArrayList<>();
        List2.add(50);
        List2.add(60);
        List2.add(70);

        System.out.println("Adding elements from List2 at the end of List.");
        List.addAll(List2);
        System.out.println("List after adding List2 Elements: "+List);

        ArrayList <Integer> List3 = new ArrayList<>();
        List3.add(1);
        List3.add(2);
        List3.add(3);

        System.out.println("Adding elements from List 3 from index 2 of List.");
        List.addAll(2,List3);
        System.out.println("List after adding List3 Elements from index 2: "+List);

        System.out.println("Elements in List 3 before using clear() method: "+List3);
        List3.clear();
        System.out.println("Elements in List3 after using clear() method: ");

        System.out.println("Checking if List contains \"Jeeya\" or not using contains(object) method: "+ List.contains("Jeeya"));
        System.out.println("Checking if List contains '100' or not using contains(object) method: "+List.contains(100));

        System.out.println("Element at index 5 of List using get(index) method is: "+List.get(5));

        System.out.println("Index of Element '60' in List using indexOf(object) method is: "+List.indexOf(60));

        System.out.println("List 3 empty, checking it using isEmpty() method: "+List3.isEmpty());
        System.out.println("List2 is not empty, checking it using isEmpty() method: "+List2.isEmpty());

        

    }
}
