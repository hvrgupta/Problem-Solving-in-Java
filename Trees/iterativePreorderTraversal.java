
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class iterativePreorderTraversal {

    public static void iterativePre(TreeNode root) {

        List<Integer> preOrder = new ArrayList<>();
        if (root == null)
            return;

        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);

        while (!stk.isEmpty()) {
            root = stk.pop();
            preOrder.add(root.val);
            if (root.right != null) {
                stk.push(root.right);
            }
            if (root.left != null) {
                stk.push(root.left);
            }
        }
        System.out.println(preOrder);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        iterativePre(root);
    }
}
