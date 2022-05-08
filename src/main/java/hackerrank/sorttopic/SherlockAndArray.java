package hackerrank.sorttopic;

import java.util.Arrays;
import java.util.List;

public class SherlockAndArray {

    public static String balancedSums(List<Integer> arr) {
        int sum = 0;

        for (Integer number : arr) {
            sum += number;
        }

        int rightSum;
        int leftSum = 0;
        for (Integer number : arr) {
            rightSum = sum - number - leftSum;
            if (leftSum == rightSum) return "YES";
            leftSum += number;
        }

        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(balancedSums(Arrays.asList(1, 2, 3)));
        System.out.println(balancedSums(Arrays.asList(1, 2, 3, 3)));
        System.out.println(balancedSums(Arrays.asList(5, 6, 8, 11)));
        System.out.println(balancedSums(Arrays.asList(1, 1, 4, 1, 1)));
        System.out.println(balancedSums(Arrays.asList(2, 0, 0, 0)));
        System.out.println(balancedSums(Arrays.asList(0, 0, 2, 0)));
    }

}
