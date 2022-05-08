package hackerrank.sorttopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCreamParlor {

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) + arr.get(i) == m) {
                    ans.add(i + 1);
                    ans.add(j + 1);
                    return ans;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(icecreamParlor(4, Arrays.asList(1, 4, 5, 3, 2)));
    }

}
