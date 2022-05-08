package hackerrank.stringTopic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Anagram {

    public static int anagram(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        int minimumCharToChange = 0;

        if (s.length() % 2 != 0) {
            return -1;
        }

        for (int i = 0; i < s.length()/2; i++) {
            Character character = s.charAt(i);

            if (hashMap.containsKey(character)) {
                int count = hashMap.get(character);
                hashMap.put(character, ++count);
            } else {
                hashMap.put(character, 1);
            }
        }

        for (int i = s.length()/2; i < s.length(); i++) {
            Character character = s.charAt(i);

            if (hashMap.containsKey(character)) {
                int count = hashMap.get(character);
                hashMap.put(character, --count);
            }
        }

        for (int value : hashMap.values()) {
            if (value > 0) {
                minimumCharToChange += value;
            }
        }

        return minimumCharToChange;
    }

    public static void main(String[] args) {
        System.out.println(anagram("aaabbb"));
        System.out.println(anagram("xaxbbbxx"));
        System.out.println(anagram("ab"));
        System.out.println(anagram("abc"));
        System.out.println(anagram("mnop"));
        System.out.println(anagram("xyyx"));
    }

}
