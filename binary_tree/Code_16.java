package binary_tree;

// Determine if a tree is height-balanced
public class Code_16 {
    private static boolean isBalanced(Node root){
        return findHeight(root) != -1;
    }
    private static int findHeight(Node root){
        if(root==null) return 0;

        int leftHeight = findHeight(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight = findHeight(root.right);
        if(rightHeight==-1) return -1;
        if(Math.abs(rightHeight-leftHeight)>1) return -1;
        return 1 + Math.max(leftHeight, rightHeight);
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

        System.out.println(isBalanced(root_1));
    }
}
