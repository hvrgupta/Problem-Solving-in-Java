import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stk.isEmpty() && stk.peek() <= nums2[i]) {
                stk.pop();
            }

            if (stk.isEmpty()) {
                hm.put(nums2[i], -1);
            } else {
                hm.put(nums2[i], stk.peek());
            }
            stk.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = hm.get(nums1[i]);
        }
        return res;
    }
}