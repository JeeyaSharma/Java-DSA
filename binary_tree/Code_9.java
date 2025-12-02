package binary_tree;

import java.util.Stack;

// Write iterative inorder code to print the inorder traversal
public class Code_9 {
    private static void printInorderIterative(Node root){
        Stack<Node> st = new Stack<Node>();
        Node curr = root;
        while(true){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }else{
                if(st.isEmpty()) break;
                curr = st.pop();
                System.out.print(curr.data+" ");
                curr = curr.right;
            }
        }
    }
    public static void main(String[] args) {
        Node root_1 = new Node(1);
        Node root_2 = new Node(2);
        Node root_3 = new Node(3);
        Node root_4 = new Node(4);
        Node root_5 = new Node(5);
        Node root_6 = new Node(6);
        Node root_7 = new Node(7);

        root_1.left = root_2;
        root_1.right = root_7;
        root_2.left = root_3;
        root_2.right = root_4;
        root_4.left = root_5;
        root_4.right = root_6;

        printInorderIterative(root_1);
    }
}
