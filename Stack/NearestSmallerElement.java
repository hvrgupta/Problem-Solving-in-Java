import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[nums.length];
        int n = nums.length;

        for(int i=0;i<n;i++) {
            while(!stk.isEmpty() && nums[i]<=stk.peek()) {
                stk.pop();
            }

            if(stk.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = stk.peek();
            }

            stk.push(nums[i]);
        }
    

        return res;

    }
}