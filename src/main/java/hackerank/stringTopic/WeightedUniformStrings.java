package hackerank.stringTopic;

import java.util.*;

public class WeightedUniformStrings {

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        List<String> result = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        int weight = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    weight += s.charAt(i) - 96;
                } else {
                    weight = s.charAt(i) - 96;
                }
                hashSet.add(weight);
            } else {
                weight = s.charAt(i) - 96;
                hashSet.add(weight);
            }
        }

        for (Integer query : queries) {
            if (hashSet.contains(query)) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        System.out.println("abb".substring(0, 1));
        System.out.println(weightedUniformStrings("abccddde", Arrays.asList(1, 3, 12, 5, 9, 10)));
    }

}
