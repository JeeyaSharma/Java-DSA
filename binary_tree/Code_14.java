package binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Write the code to find the inorder,preorder and postorder together
class Pair{
    Node node;
    int num;
    Pair(Node node, int num){
        this.node = node;
        this.num = num;
    }
}
public class Code_14 {
    private static void preInPostTraversal(Node root){
        if(root==null) return;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,1));
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        while(!st.isEmpty()){
            Pair top = st.pop();
            if(top.num==1){
                pre.add(top.node.data);
                top.num++;
                st.push(top);
                if(top.node.left!=null){
                    st.push(new Pair(top.node.left,1));
                }
            }else if(top.num==2){
                in.add(top.node.data);
                top.num++;
                st.push(top);
                if(top.node.right!=null){
                    st.push(new Pair(top.node.right,1));
                }
            }else{
                post.add(top.node.data);
            }
        }
        System.out.println("Preorder: "+pre);
        System.out.println("Inorder: "+in);
        System.out.println("Postorder: "+post);
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

        preInPostTraversal(root_1);
    }
}
