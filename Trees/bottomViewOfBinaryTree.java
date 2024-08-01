import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

class Solution {

    // Function to return a list containing the bottom view of the given tree.
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Map<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int hd = p.hd;
            Node temp = p.node;

            map.put(hd, temp.data);

            if (temp.left != null) {
                q.offer(new Pair(temp.left, hd - 1));
            }

            if (temp.right != null) {
                q.offer(new Pair(temp.right, hd + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
