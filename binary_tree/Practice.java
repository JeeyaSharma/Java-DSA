package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    private static List<Integer> preorderRecursive(Node root){
        List<Integer> ans = new ArrayList<Integer>();
        preorderRecursiveHelper(root, ans);
        return ans;
    }
    private static void preorderRecursiveHelper(Node root, List<Integer> ans){
        if(root == null) return;
        ans.add(root.data);
        preorderRecursiveHelper(root.left,ans);
        preorderRecursiveHelper(root.right,ans);
    }
    private static List<Integer> inorderRecursive(Node root){
        List<Integer> ans = new ArrayList<Integer>();
        inorderRecursiveHelper(root, ans);
        return ans;
    }
    private static void inorderRecursiveHelper(Node root, List<Integer> ans){
        if(root==null) return;
        inorderRecursiveHelper(root.left, ans);
        ans.add(root.data);
        inorderRecursiveHelper(root.right, ans);
    }
    private static List<Integer> postorderRecursive(Node root){
        List<Integer> ans = new ArrayList<Integer>();
        postorderRecursiveHelper(root, ans);
        return ans;
    }
    private static void postorderRecursiveHelper(Node root, List<Integer> ans){
        if(root == null) return;
        postorderRecursiveHelper(root.left, ans);
        postorderRecursiveHelper(root.right, ans);
        ans.add(root.data);
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

        System.out.println("Preorder: "+preorderRecursive(root_1));
        System.out.println("Inorder: "+inorderRecursive(root_1));
        System.out.println("Postorder: "+postorderRecursive(root_1));
    }
}
