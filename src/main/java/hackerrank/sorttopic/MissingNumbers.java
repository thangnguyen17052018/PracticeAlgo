package hackerrank.sorttopic;

import java.util.*;

public class MissingNumbers {

        public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
            TreeMap<Integer, Integer> mapNumbers = new TreeMap<>();

            for (Integer integer : brr) {
                int count = mapNumbers.getOrDefault(integer, 0);
                mapNumbers.put(integer, ++count);
            }

            for (Integer integer : arr) {
                if (mapNumbers.containsKey(integer)) {
                    int count = mapNumbers.get(integer);
                    mapNumbers.put(integer, --count);
                    if (count == 0) {
                        mapNumbers.remove(integer);
                    }
                } else {
                    mapNumbers.put(integer, 1);
                }
            }

            System.out.println(mapNumbers);

            return new ArrayList<>(mapNumbers.keySet());
        }

    public static void main(String[] args) {
        System.out.println(missingNumbers(Arrays.asList(7, 2, 5, 3, 5, 3), Arrays.asList(7, 2, 5, 4, 6, 3, 5, 3, 4, 6)));

    }

}
