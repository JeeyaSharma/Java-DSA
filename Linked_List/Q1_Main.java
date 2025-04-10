// Create 3 nodes and link them in order N1->N2->N3->NULL
public class Q1_Main {
    public static void main(String[] args){
        Q1_LL list = new Q1_LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.display();
    }

}
