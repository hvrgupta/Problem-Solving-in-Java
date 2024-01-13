package Array;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {100,200,20};
        checkSortedArray(arr);
    }

    public static void checkSortedArray(int[] arr) {
        if(arr.length == 1) {
            System.out.println("Yes");
        }
        int count = 0;

        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] <= arr[i+1]) {
                count++;
            }else{
                break;
            }
        }

        if(count == arr.length-1)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
