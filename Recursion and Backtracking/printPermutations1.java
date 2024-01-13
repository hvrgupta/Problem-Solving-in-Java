import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class printPermutations1 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    HashMap<Integer, Boolean> map = new HashMap<>();

    private void helper(int[] nums) {

        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!map.get(nums[i])) {
                curr.add(nums[i]);
                map.put(nums[i], true);
                // System.out.println("before i: "+i + " " + curr);
                helper(nums);
                // System.out.println("after i: "+i + " " + curr);
                map.put(nums[i], false);
                curr.remove(curr.size() - 1);
            }
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        for (int num : nums) {
            map.put(num, false);
        }

        helper(nums);
        System.out.println(res);
        return res;
    }
}
