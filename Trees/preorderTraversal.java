
class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
    }
}

// Preorder traversal - Root Left Right
// TC - O(N) S.C- > O(Height of tree)

public class preorderTraversal {

    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);

        preorder(root);
    }
}
