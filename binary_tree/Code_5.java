package binary_tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Level-order Traversal in Binary Tree
public class Code_5 {
    private static List<List<Integer>> levelOrder(Node root){
        Queue<Node> q = new LinkedList<Node>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                subList.add(q.poll().data);
            }
            ans.add(subList);
        }
        return ans;
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
        root_1.right = root_3;
        root_2.left = root_4;
        root_2.right = root_5;
        root_3.left = root_6;
        root_3.right = root_7;

        System.out.println(levelOrder(root_1));
    }
}
