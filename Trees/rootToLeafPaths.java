import java.util.*;

/*
 * 
 * Definition for Binary Tree Node
 * class Node
 * {
 * int data;
 * Node left;
 * Node right;
 * 
 * Node(int data)
 * {
 * this.data = data;
 * left = null;
 * right = null;
 * }
 * }
 */

class Solution {
    private static ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    private static void helper(Node root, ArrayList al) {
        if (root == null) {
            return;
        }
        al.add(root.data);
        if (root.left == null && root.right == null) {
            res.add(new ArrayList(al));
            al.remove(al.size() - 1);
            return;
        }

        helper(root.left, al);
        helper(root.right, al);
        al.remove(al.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        res.clear();
        if (root == null)
            return res;
        helper(root, al);
        return res;
    }
}
