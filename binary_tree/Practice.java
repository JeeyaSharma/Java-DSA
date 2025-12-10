package binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Practice {
    private static List<Integer> preorderRecursive(Node root){
        List<Integer> ans = new ArrayList<>();
        preorderRecursiveHelper(root, ans);
        return ans;
    }
    private static void preorderRecursiveHelper(Node root, List<Integer> ans){
        if(root==null) return;
        ans.add(root.data);
        preorderRecursiveHelper(root.left, ans);
        preorderRecursiveHelper(root.right, ans);
    }
    private static List<Integer> inorderRecursive(Node root){
        List<Integer> ans = new ArrayList<>();
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
        List<Integer> ans = new ArrayList<>();
        postorderRecursiveHelper(root, ans);
        return ans;
    }
    private static void postorderRecursiveHelper(Node root, List<Integer> ans){
        if(root==null) return;
        postorderRecursiveHelper(root.left, ans);
        postorderRecursiveHelper(root.right, ans);
        ans.add(root.data);
    }
    private static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0;i<level;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                subList.add(q.poll().data);
            }
            ans.add(subList);
        }
        return ans;
    }
    private static List<Integer> preorderIterative(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            if(curr.right!=null) st.push(curr.right);
            if(curr.left!=null) st.push(curr.left);
            ans.add(curr.data);
        }
        return ans;
    }
    private static List<Integer> inorderIterative(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(true){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }else{
                if(st.isEmpty()) break;
                curr = st.pop();
                ans.add(curr.data);
                curr = curr.right;
            }
        }
        return ans;
    }
    private static List<Integer> postorderIterative(Node root){
        List<Integer> ans = new ArrayList<>();
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

        System.out.println("Preorder: "+preorderRecursive(root_1));
        System.out.println("Inorder: "+inorderRecursive(root_1));
        System.out.println("Postorder: "+postorderRecursive(root_1));
        System.out.println("Level-Order: "+levelOrder(root_1));
        System.out.println("Preorder Iterative: "+preorderIterative(root_1));
        System.out.println("Inorder Iterative: "+inorderIterative(root_1));
        System.out.println("Postorder Iterative: "+postorderIterative(root_1));
    }
}
