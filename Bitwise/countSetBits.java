import java.util.Scanner;

public class countSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        // One of the solution is to right shift every bit and checks with position of
        // last bit and then increase the counter. It takes theta(d) d -> no of bits
        // till MSB

        // There is a standard algorithm which takes theta(x) time, x -> no. of set bits
        // Brian Cunningham Algorithm

        int res = 0;

        while (n > 0) {
            n = n & (n - 1);
            res++;
        }
        System.out.println("Set bits: " + res);

        // Another solution is lookup table which gives solution in O(1) time.
        System.out.println("Enter number");
        n = sc.nextInt();
        int tbl[] = new int[256];
        // initialize
        tbl[0] = 0;
        for (int i = 1; i <= 255; i++) {
            tbl[i] = tbl[i & (i - 1)] + 1;
        }

        // count set bits
        res = tbl[n & 255] + tbl[(n >> 8) & 255] + tbl[(n >> 16) & 255] + tbl[(n >> 24)];
        System.out.println("Set bits: " + res);
        sc.close();
    }
}
