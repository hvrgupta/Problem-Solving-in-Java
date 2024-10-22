class Solution {
    public int rob(int[] nums) {
        // dp using only two variables
        int a = 0;
        int b = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            int temp = b;
            b = Math.max(temp, nums[i - 1] + a);
            a = temp;
        }
        return b;
    }
}