package binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Write the iterative code for PostOrder traversal using 1 stack
public class Code_11 {
   private static List<Integer> postorderIterative(Node root){
    List<Integer> ans = new ArrayList<>();
    Stack<Node> st = new Stack<>();
    Node curr = root;
    while(curr!=null || !st.isEmpty()){
        if(curr!=null){
            st.push(curr);
            curr = curr.left;
        }else{
            Node temp = st.peek().right;
            if(temp==null){
                temp = st.peek();
                st.pop();
                ans.add(temp.data);
                while(!st.isEmpty() && temp==st.peek().right){
                    temp = st.peek();
                    st.pop();
                    ans.add(temp.data);
                }
            }else{
                curr = temp;
            }
        }
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

        System.out.println(postorderIterative(root_1));
   }
}
