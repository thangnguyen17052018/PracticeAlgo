package hackerrank.sortTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningTimeOfAlgo {

    public static int runningTime(List<Integer> arr) {
        int count = 0;

        for (int i = 1; i < arr.size(); i++) {
            int k = arr.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j) >= k) {
                    arr.set(j + 1, arr.get(j));
                    if (arr.get(j) > k) count++;

                    if (j == 0) {
                        arr.set(j, k);
                    }
                } else {
                    arr.set(j + 1, k);
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 3));
        System.out.println(runningTime(arr));
        List<Integer> brr = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3));
        System.out.println(runningTime(brr));
        List<Integer> crr = new ArrayList<>(Arrays.asList(1, 3, 2));
        System.out.println(runningTime(crr));
        List<Integer> drr = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
        System.out.println(runningTime(drr));
        List<Integer> err = new ArrayList<>(Arrays.asList(3, 4, 7, 5, 6, 2, 1));
        System.out.println(runningTime(err));
    }

}
