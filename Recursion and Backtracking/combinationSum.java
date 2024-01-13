import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> currRes = new ArrayList<>();

    public static void helper(int[] candidates, int target, int idx, int n) {

        if (idx == n) {
            if (target == 0) {
                res.add(new ArrayList<>(currRes));
            }
            return;
        }

        if (target >= candidates[idx]) {
            currRes.add(candidates[idx]);
            helper(candidates, target - candidates[idx], idx, n);
            currRes.remove(currRes.size() - 1);
        }
        helper(candidates, target, idx + 1, n);

    }

    public static List<List<Integer>> combinationSum1(int[] candidates, int target) {
        int n = candidates.length;
        helper(candidates, target, 0, n);
        return res;
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 3, 5, 7 };
        System.out.println(combinationSum1(candidates, 7));

    }

}
