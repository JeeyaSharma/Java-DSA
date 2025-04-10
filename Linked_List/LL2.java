public class LL2 {
    private Node head;
    private Node tail;
    private int size;

    LL2(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public void insertLast(int value){
        if(tail==null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        Node temp=head.next;
        head=temp;
        if(head==null){
            tail=null;
        }
        size--;

        return val;
    }

    public int delete_index(int index){
        if(index==0) return deleteFirst();
        if(index==size) return deleteLast();
        Node removeElement = getIndexVal(index) ;
        int val = removeElement.value;
        Node prevElem = getIndexVal(index-1);
        prevElem.next=removeElement.next;

        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = getIndexVal(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public Node getNode(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public Node getIndexVal(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println(" END");
    }

    private class Node{

        private int value;
        private Node next;

        Node(int value){
            this.value=value;
        }
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
