import java.util.Scanner;

public class checkKthBitSetOrNot {
    // The given program is provided input n (number) and k (bit to be checked if it
    // is set or not)
    // Sample
    // I/P: n=5,k=1
    // O/P: Yes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter Kth bit to check");
        int k = sc.nextInt();
        sc.close();

        // Implementation using left shift
        int chk = 1;
        if (k != 1)
            chk = chk << (k - 1);

        if ((n & chk) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        // Implementation using right shift

        chk = 1;
        n = n >> (k - 1);
        if ((n & chk) == 1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}