
public class diameterOfBinaryTree {
    private int helper(TreeNode root, int[] diameter) {
        if (root == null)
            return 0;

        int left = helper(root.left, diameter);
        int right = helper(root.right, diameter);

        diameter[0] = Math.max(diameter[0], left + right);

        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        // using array to pass element as reference
        int[] diameter = new int[1];
        helper(root, diameter);
        return diameter[0];
    }
}
