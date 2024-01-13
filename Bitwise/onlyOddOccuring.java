public class onlyOddOccuring {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 4, 4, 4, 5, 5 };
        // find no which appears odd time. Time->theta(N)
        int oddNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            oddNum = oddNum ^ arr[i];
        }
        System.out.println("Odd Number in the Array: " + oddNum);
    }
}
