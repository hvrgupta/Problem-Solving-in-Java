import java.util.ArrayList;

public class subsetSum1 {

    ArrayList<Integer> res = new ArrayList<>();

    void helper(ArrayList<Integer> arr, int idx, int sum) {
        if (idx == arr.size()) {
            res.add(sum);
            return;
        }

        sum += arr.get(idx);
        helper(arr, idx + 1, sum);
        sum -= arr.get(idx);
        helper(arr, idx + 1, sum);

    }

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        // code here

        helper(arr, 0, 0);
        return res;

    }

}
