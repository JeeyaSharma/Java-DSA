public class Main_LL2 {
    public static void main(String[] args){
        LL2 list = new LL2();

        list.insertFirst(10);
        list.insertFirst(8);
        list.insertFirst(6);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(0);

        list.insertLast(12);
        list.insertLast(14);

        list.insert(1,1);
        list.insert(3,3);

        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete_index(3);
        list.display();
    }
}
