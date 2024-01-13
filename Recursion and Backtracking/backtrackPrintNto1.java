public class backtrackPrintNto1 {

    public static void backprintNto1Fn(int n) {
        if (n < 1)
            return;
        System.out.println(n);
        backprintNto1Fn(n - 1);
    }

    public static void main(String[] args) {
        backprintNto1Fn(5);
    }
}
