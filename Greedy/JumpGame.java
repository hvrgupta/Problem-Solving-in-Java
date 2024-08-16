package Greedy;

class Solution {
    public boolean canJump(int[] nums) {
        int idxtouched = 0;
        if (nums.length == 1)
            return true;
        for (int i = 0; i < nums.length; i++) {
            if (idxtouched >= i)
                idxtouched = Math.max(idxtouched, i + nums[i]);
        }
        if (idxtouched >= nums.length - 1)
            return true;
        else
            return false;
    }
}
