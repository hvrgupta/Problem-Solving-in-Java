public class sumOfFirstNnumbers {

    public static int sumOfNnumbers(int n) {
        if (n == 0)
            return 0;
        return n + sumOfNnumbers(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNnumbers(5));
    }
}
