package hackerrank.stringTopic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Gemstones {

    public static int gemstones(List<String> arr) {
        Set<Character> hashSet;
        int[] checkChar = new int[26];
        int count = 0;
        int numberAppearedCondition = arr.size();
        for (String rockString : arr) {
            hashSet = new HashSet<>();
            for (int i = 0; i < rockString.length(); i++) {
                char character = rockString.charAt(i);
                if (!hashSet.contains(character)) {
                    hashSet.add(character);
                    checkChar[(int) character - 97]++;
                    if (checkChar[(int) character - 97] == numberAppearedCondition) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(gemstones(Arrays.asList("abc", "abc", "bc")));
    }

}
