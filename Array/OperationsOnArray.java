package Array;

public class OperationsOnArray {
    public static void main(String args[]) {
        int arr[] = {2,5,6,8,0,0,0};
               
        search(arr,2);
        insert(arr,7,4);
        delete(arr,5);
    }

    public static void search(int[] arr,int s) {
        for(int i = 0; i<arr.length;i++) {
            if(arr[i] == s) {
                System.out.println("Element found at pos "  + (i+1));
                break;
            }
        }
        System.out.println("Element not found");
    }

    public static void insert(int[] arr,int x, int pos) {
        int idx = pos - 1;
        for(int i = arr.length -1;i>idx;i--) {
            arr[i] = arr[i-1];
        }
        arr[idx] = x;
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void delete(int[] arr, int el) {
       int elPos = -1;
        for(int i=0;i<arr.length;i++) {
            if(el == arr[i]) {
                elPos = i;
                break;
            }
        }
       
        for(int i=elPos+1;i<arr.length;i++) {
            arr[i-1] = arr[i];
        }
        System.out.println("Delete element array");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
    }


}
