package binary_tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// Iterative preorder traversal
public class Code_7 {
    private static List<Integer> iterativePreorder(Node root){
        List<Integer> ans = new LinkedList<Integer>();
        if(root==null) return ans;
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            ans.add(root.data);
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
        }
        return ans;
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

        System.out.println(iterativePreorder(root_1));
    }
}
