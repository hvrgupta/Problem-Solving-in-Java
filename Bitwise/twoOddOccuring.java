public class twoOddOccuring {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 3, 4, 5, 6, 7, 7 };
        int xor = arr[0], res1 = 0, res2 = 0, k = 0;

        for (int i = 1; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        k = xor & ~(xor - 1);

        for (int i = 0; i < arr.length; i++) {
            if ((k & arr[i]) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 ^= arr[i];
        }
        System.out.println("Odd occuring elements are " + res1 + " & " + res2);

    }
}
