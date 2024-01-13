import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        // Check if given no is power of two or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        if (n <= 0)
            System.out.println("No");

        if ((n & (n - 1)) == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();

    }
}
