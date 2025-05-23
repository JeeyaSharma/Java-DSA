public class Q1_LL {
    private Node head;
    private Node tail;
    private int size;

    Q1_LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println(" NULL");
    }
    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value=value;
        }
        
    }
}
