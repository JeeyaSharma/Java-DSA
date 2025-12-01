package binary_tree;

import java.util.ArrayList;
import java.util.List;

// Find the inorder traversal of a tree
// class Node{
//     int val;
//     Node left;
//     Node right;
//     public Node(int val){
//         this.val = val;
//     }
// }
public class Code_3 {
    private static void inorder(Node root, List<Integer> ans){
        if(root == null) return;

        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
    private static void printInorderTraversal(Node root){
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Node root_1 = new Node(1);
        Node root_2 = new Node(2);
        Node root_3 = new Node(3);
        Node root_4 = new Node(4);
        Node root_5 = new Node(5);
        Node root_6 = new Node(6);

        root_1.left = root_2;
        root_1.right = root_3;
        root_2.left = root_4;
        root_2.right = root_5;
        root_5.left = root_6;
        root_3.left = new Node(7);
        root_3.right = new Node(8);
        root_3.right.left = new Node(9);
        root_3.right.right = new Node(10);

        printInorderTraversal(root_1);
    }
}
