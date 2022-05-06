package hackerank.stringTopic;

import java.util.HashSet;
import java.util.Set;

public class StringConstruction {

    public static int stringConstruction(String s) {
        int minimumCost = 0;

        Set<Character> hashSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            if (!hashSet.contains(s.charAt(i))) {
                hashSet.add(s.charAt(i));
                minimumCost++;
            }

        }

        return minimumCost;
    }

    public static void main(String[] args) {
        System.out.println(stringConstruction("abcc"));
        System.out.println(stringConstruction("abab"));
        System.out.println(stringConstruction("abcd"));
    }

}
