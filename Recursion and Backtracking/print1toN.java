public class print1toN {

    public static void print1toNFn(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print1toNFn(i + 1, n);
    }

    public static void main(String[] args) {
        print1toNFn(1, 5);
    }
}