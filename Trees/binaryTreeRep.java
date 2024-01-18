package Trees;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
    }
}

class Test {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);
    }
}
