public class printNto1 {

    public static void printNto1Fn(int n) {
        if (n < 1)
            return;
        System.out.println(n);
        printNto1Fn(n - 1);
    }

    public static void main(String[] args) {
        printNto1Fn(5);
    }
}
