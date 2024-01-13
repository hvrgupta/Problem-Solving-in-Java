import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetSum2 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> currRes = new ArrayList<>();

    public void helper(int idx, int[] nums) {
        if (idx == nums.length + 1) {
            return;
        }

        res.add(new ArrayList<>(currRes));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1])
                continue;

            currRes.add(nums[i]);
            helper(i + 1, nums);
            currRes.remove(currRes.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(0, nums);
        return res;
    }
}
