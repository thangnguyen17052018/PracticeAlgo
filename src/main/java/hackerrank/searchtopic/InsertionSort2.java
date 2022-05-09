package hackerrank.searchtopic;

import java.util.Arrays;
import java.util.List;

public class InsertionSort2 {

    public static void insertionSort2(int n, List<Integer> arr) {

        for (int i = 1; i < n; i++) {
            int k = arr.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j) >= k) {
                    arr.set(j + 1, arr.get(j));
                    if (j == 0) {
                        arr.set(j, k);
                    }
                } else {
                    arr.set(j + 1, k);
                    break;
                }
            }
            printArray(arr);
        }

    }

    public static void printArray(List<Integer> arr) {
        arr.forEach(number -> System.out.print(number + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 4, 7, 5, 6, 2, 1);
        insertionSort2(7, arr);
    }

}
