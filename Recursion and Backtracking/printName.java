public class printName {

    public static void printNamefn(int n) {
        if (n == 0)
            return;
        System.out.println("Harsh");
        printNamefn(n - 1);
    }

    public static void main(String[] args) {
        printNamefn(5);
    }
}