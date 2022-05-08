package hackerrank.stringTopic;

import java.util.Arrays;
import java.util.List;

public class HackerRankInAString {

    public static String hackerrankInString(String s) {
        List<Character> hackerRankList = Arrays.asList('h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k');
        List<Integer> checkList = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        int checkIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (checkIndex < checkList.size()) {
                if (s.charAt(i) == hackerRankList.get(checkIndex)) {
                    checkList.set(checkIndex, 1);
                    checkIndex++;
                }
            }
        }

        return (checkList.contains(0)) ? "NO" : "YES";
    }

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereuamstackerrank"));
    }

}
