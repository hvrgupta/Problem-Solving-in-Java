public class backtrackPrint1toN {
    public static void backprint1toNFn(int n) {
        if (n < 1)
            return;
        backprint1toNFn(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        // System.out.println("back");
        backprint1toNFn(5);
    }
}
