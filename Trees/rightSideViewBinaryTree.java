import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

// Level Order Solution
class Solution {
    // TC - O(N), SC- O(N)
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                TreeNode temp = q.poll();
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
                if (i == s - 1)
                    ans.add(temp.val);
            }
        }
        return ans;
    }
}

// DFS Solution
// TC - O(N) SC - O(H)
class Solution2 {

    ArrayList<Integer> res = new ArrayList<>();

    private void helper(TreeNode root, int level) {
        if (root == null)
            return;

        if (level == res.size())
            res.add(root.val);

        helper(root.right, level + 1);
        helper(root.left, level + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        helper(root, 0);
        return res;
    }
}