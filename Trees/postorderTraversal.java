
class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
    }
}

// Postorder traversal - Left Right Root

public class postorderTraversal {

    public static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);

        postorder(root);
    }
}
