
class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
    }
}

// Inorder traversal -- Left Root Right

public class inorderTraversal {
    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);

        inorder(root);
    }
}
