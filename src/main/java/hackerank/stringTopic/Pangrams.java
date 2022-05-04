package hackerank.stringTopic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pangrams {

    public static boolean isLower(char s) {
        return s >= 'a' && s <= 'z';
    }

    public static boolean isUpper(char s) {
        return s >= 'A' && s <= 'Z';
    }

    public static String pangrams(String s) {
        List<Integer> alphabetCharacters = IntStream.of(new int[26])
                                                    .boxed()
                                                    .collect(Collectors.toList());

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') continue;
            char character = isUpper(s.charAt(i)) ? (char)((int)s.charAt(i) + 32) : s.charAt(i);
            if (isLower(character)) {
                alphabetCharacters.set((int) character - 97, 1);
            }
        }

        return alphabetCharacters.contains(0) ? "not pangram" : "pangram";
    }

    public static void main(String[] args) {
        System.out.println((int) 'a' - 97);
    }

}
