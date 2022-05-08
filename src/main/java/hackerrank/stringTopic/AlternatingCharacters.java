package hackerrank.stringTopic;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAABBB"));
    }

}
