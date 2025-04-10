public class Main_LL1 {
    public static void main(String[] args){
        LL1 list = new LL1();

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.insertLast(6);

        list.insert(7,1);

        list.display();
        
    }
}
