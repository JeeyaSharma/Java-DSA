package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a binary tree, print all nodes at odd levels of the tree. Assume the root node is at level 1 i.e. odd level.
Complete the function printOdd() which will take the root node of the tree as parameter and print the nodes at odd levels of the binary tree.

Input Format
First Line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.

Output Format
Print the nodes at odd levels separated by space.

Constraints
0 <= N <= 10^5

Sample Input
6
1 2 3 4 5 6

Sample Output
1 4 5 6

Explanation:

        1            // level-1
       / \
      2    3
     / \  /
    4  5 6           // level-3
*/
public class Code_13 {
    private static void printOdd(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int currentLevel = 1;
        while(!q.isEmpty()){
            int level = q.size();
            for(int i=0;i<level;i++){
                Node curr = q.poll();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                if(currentLevel%2!=0){
                    System.out.print(curr.data);
                    if(i<level){
                        System.out.print(" ");
                    }
                }
            }
            currentLevel++;
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

        printOdd(root_1);
    }
}
