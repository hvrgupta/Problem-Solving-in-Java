import java.util.ArrayList;
import java.util.List;

public class countSubSeqSumK {
    static List<Integer> li = new ArrayList<>();

    public static int printSubSumeqK(int i, int[] arr, int s, int sum) {
        if (i == arr.length) {
            if (sum == s) {
                System.out.println(li);
                return 1;
            }
            return 0;
        }

        li.add(arr[i]);
        s += arr[i];
        int sum1 = printSubSumeqK(i + 1, arr, s, sum);

        li.remove(li.size() - 1);
        s -= arr[i];
        int sum2 = printSubSumeqK(i + 1, arr, s, sum);
        return sum1 + sum2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int sum = 2;
        System.out.println(printSubSumeqK(0, arr, 0, sum));
    }
}