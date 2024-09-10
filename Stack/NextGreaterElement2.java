import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[nums.length];
        int n = nums.length;

        for(int i=2*n-1;i>=0;i--) {
            while(!stk.isEmpty() && nums[i%n]>=stk.peek()) {
                stk.pop();
            }

            if(stk.isEmpty()){
                res[i%n] = -1;
            }else{
                res[i%n] = stk.peek();
            }

            stk.push(nums[i%n]);
        }
    

        return res;

    }
}