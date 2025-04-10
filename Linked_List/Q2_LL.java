public class Q2_LL {
    private Node head;

    Q2_LL(){
        head=null;
    }
    
    Node getHead(){
        return this.head;
    }

    void insertAtBegining(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
    }

    void insertAtEnd(int val){
        Node newNode= new Node(val);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void insertAtPosition(int val,int index){
        if(index==1){
            insertAtBegining(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null) return;
        Node newNode= new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void deleteAtBegining(){
        if(head==null) return;
        head=head.next;
    }

    void deleteAtLast(){
        if(head==null) return;
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    void deleteAtPosition(int pos){
        if(head==null) return;
        if(pos==1){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null) return;
        temp.next=temp.next.next;
    }

    void deleteByValue(int val){
        if(head==null) return;
        if(head.value==val){
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.value!=val){
            temp=temp.next;
        }
        temp.next=temp.next.next;
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
