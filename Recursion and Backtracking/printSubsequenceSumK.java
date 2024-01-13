import java.util.ArrayList;
import java.util.List;

class printSubSumK {
    static List<Integer> li = new ArrayList<>();

    // Print all subsequences whose sum is K (Pattern 1)
    public static void printSubSumeqK(int i, int[] arr, int s, int sum) {
        if (i == arr.length) {
            if (sum == s) {
                System.out.println(li);
            }
            return;
        }

        li.add(arr[i]);
        s += arr[i];
        printSubSumeqK(i + 1, arr, s, sum);

        li.remove(li.size() - 1);
        s -= arr[i];
        printSubSumeqK(i + 1, arr, s, sum);
    }

    // Print any one subsequence whose sum is K (Pattern 2)
    public static boolean printOneSubSumeqK(int i, int[] arr, int s, int sum) {
        if (i == arr.length) {
            if (sum == s) {
                System.out.println(li);
                return true;
            }
            return false;
        }

        li.add(arr[i]);
        s += arr[i];

        if (printOneSubSumeqK(i + 1, arr, s, sum))
            return true;

        li.remove(li.size() - 1);
        s -= arr[i];

        if (printOneSubSumeqK(i + 1, arr, s, sum))
            return true;

        return false;
    }

    // Pattern 3 is Count subsequence whose sum is K covererd in another file

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int sum = 2;
        printSubSumeqK(0, arr, 0, sum);
    }
}