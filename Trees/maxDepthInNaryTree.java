class Solution {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;

        int height = 0;
        for (int i = 0; i < root.children.size(); i++) {
            height = Math.max(maxDepth(root.children.get(i)), height);
        }

        return height + 1;
    }
}