package Array;

public class LargestElementInArray {
    public static void main(String args[]) {
        int arr[] = {10,5,20,8};
        findLargest(arr);
    }

    public static void findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element : " + max);
    }
}
