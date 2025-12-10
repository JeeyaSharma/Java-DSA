package binary_tree;

import java.util.*;

// Write the iterative code for PostOrder traversal using 2 stacks
public class Code_10 {
    private static List<Integer> postorderIterative(Node root){
        List<Integer> ans = new ArrayList<>();
        postorderIterativeHelper(root, ans);
        return ans;
    }
    private static void postorderIterativeHelper(Node root, List<Integer> ans){
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left!=null) st1.push(root.left);
            if(root.right!=null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().data);
        }
    }
    public static void main(String[] args){
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

        System.out.println(postorderIterative(root_1));
    }
}
