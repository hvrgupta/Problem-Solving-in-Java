// reverse an array using one variable

public class reverseArray {

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void reveseArrRecursion(int i, int[] nums, int n) {
        if (i >= n / 2)
            return;
        swap(nums, i, n - i - 1);
        reveseArrRecursion(i + 1, nums, n);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        reveseArrRecursion(0, nums, nums.length);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
