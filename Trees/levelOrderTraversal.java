package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

// T.C. - O(N)
// S.C. - O(N) -> queue full in worst case

public class levelOrderTraversal {
    public static void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();

        if (root == null)
            return;
        q.offer(root);
        while (!q.isEmpty()) {
            // adding the number of element present in that level
            int level = q.size();
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < level; i++) {
                if (q.peek().left != null)
                    q.offer(q.peek().left);
                if (q.peek().right != null)
                    q.offer(q.peek().right);

                subList.add(q.poll().val);
            }
            list.add(subList);
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        levelOrder(root);
    }
}