package hackerrank.stringTopic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    public static int sherlockAndAnagrams(String s) {
        int count;
        int[][] dp = new int[s.length()][26];
        Map<Integer, Integer> hashMapFrequentSubstring = new HashMap<>();

        dp[0][s.charAt(0) - 'a']++;
        for (int i = 1; i < s.length(); i++) {
            dp[i] = dp[i - 1].clone();
            dp[i][s.charAt(i) - 'a']++;
        }

        for (int l = 0; l < s.length(); l++) {
            for (int r = l; r < s.length(); r++) {
                int[] numberFrequentsOfSubstring = new int[26];
                for (int i = 0; i < 26; i++) {
                    if (l == 0) {
                        numberFrequentsOfSubstring[i] = dp[r][i];
                    } else {
                        numberFrequentsOfSubstring[i] = dp[r][i] - dp[l - 1][i];
                    }
                }

                int hashCode = Arrays.hashCode(numberFrequentsOfSubstring);
                if (hashMapFrequentSubstring.containsKey(hashCode)) {
                    int frequent = hashMapFrequentSubstring.get(hashCode);
                    hashMapFrequentSubstring.put(hashCode, ++frequent);
                } else {
                    hashMapFrequentSubstring.put(hashCode, 1);
                }
            }
        }

        System.out.println(hashMapFrequentSubstring);

        //ex: c2|3
        count = hashMapFrequentSubstring.values().stream().mapToInt(integer -> integer).map(frequent -> (frequent - 1) * frequent / 2).sum();

        return count;
    }

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("abba"));
        System.out.println(sherlockAndAnagrams("mom"));
        System.out.println(sherlockAndAnagrams("ifailuhkqq"));
        System.out.println(sherlockAndAnagrams("kkkk"));

    }

}
