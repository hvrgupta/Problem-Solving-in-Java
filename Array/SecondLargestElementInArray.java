package Array;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,5,8,20};
        findSecondLargest(arr);
    }

    public static void findSecondLargest(int[] arr) {
        int res = -1;
        int largest = 0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            }else if(arr[i] != arr[largest]) {
                if(res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        System.out.println(" Second Max Pos : " + res);
    }
}
