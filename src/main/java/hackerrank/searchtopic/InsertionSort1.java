package hackerrank.searchtopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort1 {

    public static void insertionSort1(int n, List<Integer> arr) {
        int k = arr.get(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) >= k) {
                arr.set(i + 1, arr.get(i));
                printArray(arr);
                if (i == 0) {
                    arr.set(i, k);
                    printArray(arr);
                }
            } else {
                arr.set(i + 1, k);
                printArray(arr);
                return;
            }
        }
    }

    private static void printArray(List<Integer> arr) {
        arr.forEach(number -> System.out.print(number + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 3));
        insertionSort1(5, arr);
        List<Integer> brr = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3));
        insertionSort1(5, brr);
        List<Integer> crr = new ArrayList<>(Arrays.asList(1, 3, 2));
        insertionSort1(3, crr);
        List<Integer> drr = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
        insertionSort1(10, drr);
        List<Integer> err = new ArrayList<>(Arrays.asList(3, 4, 7, 5, 6, 2, 1));
        insertionSort1(7, err);
    }

}
