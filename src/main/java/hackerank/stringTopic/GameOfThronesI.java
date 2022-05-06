package hackerank.stringTopic;

public class GameOfThronesI {

    public static String gameOfThrones(String s) {
        int[] checkCharacter = new int[26];
        int check = 0;

        for (int i = 0; i < s.length(); i++) {
            int characterIndex = s.charAt(i) - 'a';
            checkCharacter[characterIndex]++;
        }

        for (int j : checkCharacter) {
            if (j % 2 != 0) {
                check++;
            }
        }

        return check <= 1 ? "YES" : "NO";
    }


    public static void main(String[] args) {
        System.out.println(gameOfThrones("ddcceefbfbfeeccdd"));
        System.out.println(gameOfThrones("cdcdcdcdeeeef"));
        System.out.println(gameOfThrones("ddcceefeeccdd"));
    }

}
