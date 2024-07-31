
class heightOfBinaryTree {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if (node == null)
            return 0;
        else
            return Math.max(height(node.left), height(node.right)) + 1;
    }
}