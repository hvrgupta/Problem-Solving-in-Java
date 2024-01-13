package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class EvenOddComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 % 2 - o2 % 2;
    }

}

public class Sorting1 {
    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Arrays.sort(arr, new EvenOddComparator());
        System.out.println(Arrays.toString(arr));
    }
}
