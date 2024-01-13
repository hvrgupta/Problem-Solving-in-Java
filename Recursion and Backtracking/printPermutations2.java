import java.util.ArrayList;
import java.util.List;

public class printPermutations2 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    public void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void helper(int[] nums, int idx) {
        if (idx == nums.length) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                al.add(nums[i]);
            }
            res.add(al);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(idx, i, nums);
            helper(nums, idx + 1);
            swap(idx, i, nums);
        }

    }

    public List<List<Integer>> permute(int[] nums) {

        helper(nums, 0);
        System.out.println(res);
        return res;
    }
}
