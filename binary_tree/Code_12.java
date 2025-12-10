package binary_tree;

import java.util.Stack;

/*
Create a binary tree from array bookmark_border
Given an array of integer elements, create a binary tree from this array in level order fashion.

Input Format
The array of elements is given and you have to build the tree from it in level order i.e. elements from left in the array will be filled in the tree level wise starting from level 0.
Do not write the whole program, just complete the function buildTree(int arr[], int n) which takes the array and total number of nodes as parameter and return the root of the binary tree.

﻿Output Format
Print the tree in inorder.

Constraints
0 <= n <= 10^5

Sample Input
6  // n
1
2
3
4
5
6

Sample Tree

        1
       / \
      2    3
     / \  /
    4  5 6

Sample Output
4 2 5 1 6 3
*/
public class Code_12 {
    private static Node buildTree(int n, int[] arr){
        Node[] nodes = new Node[n];
        for(int i=0;i<n;i++){
            nodes[i] = new Node(arr[i]);
        }
        for(int i=0;i<n;i++){
            int left_index = 2*i+1;
            int right_index = 2*i+2;
            if(left_index<n) nodes[i].left = nodes[left_index];
            if(right_index<n) nodes[i].right = nodes[right_index];
        }
        printInorder(nodes[0]);
        return nodes[0];
    }
    private static void printInorder(Node root){
        Stack<Node> st = new  Stack<>();
        Node curr = root;
        while(true){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }else{
                if(st.isEmpty()) break;
                curr = st.pop();
                System.out.print(curr.data+" ");
                curr = curr.right;
            }
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1,2,3,4,5,6};
        buildTree(n, arr);
    }
    
}
