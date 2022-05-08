package hackerrank.stringTopic;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        Set<Character> hashSetS1 = hashCharacterOfString(s1);

        for (int i = 0; i < s2.length(); i++) {
            if (hashSetS1.contains(s2.charAt(i))) {
                return "YES";
            }
        }

        return "NO";
    }

    public static Set<Character> hashCharacterOfString(String s) {
        Set<Character> hashSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            hashSet.add(s.charAt(i));
        }

        return hashSet;
    }

    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));

    }

}
