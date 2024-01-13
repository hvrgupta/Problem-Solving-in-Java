import java.util.ArrayList;
import java.util.List;

public class combinationSum2 {

    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> currRes = new ArrayList<>();

    public static void helper(int[] candidates, int target, int idx, int n) {
        if (target == 0) {
            res.add(new ArrayList<>(currRes));
            return;
        }

        for (int i = idx; i < n; i++) {
            if (i > idx && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] > target)
                break;

            currRes.add(candidates[i]);
            // System.out.println("before- " + currRes);
            helper(candidates, target - candidates[i], i + 1, n);
            currRes.remove(currRes.size() - 1);
            // System.out.println("after- " + currRes);
        }

    }

    public static List<List<Integer>> combinationSumtwo(int[] candidates, int target) {
        int n = candidates.length;
        helper(candidates, target, 0, n);
        return res;
    }

    public static void main(String[] args) {
        // always have candidates array sorted
        int[] candidates = { 2, 3, 5, 7 };
        System.out.println(combinationSumtwo(candidates, 7));
    }
}
