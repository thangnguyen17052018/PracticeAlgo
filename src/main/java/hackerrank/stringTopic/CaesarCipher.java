package hackerrank.stringTopic;

public class CaesarCipher {

    public static final int lowerCaseMinRange = 97;
    public static final int lowerCaseMaxRange = 122;
    public static final int upperCaseMinRange = 65;
    public static final int upperCaseMaxRange = 90;

    public static boolean isInRangeLower(char s) {
        return (s >= 'a' && s <= 'z');
    }

    public static boolean isInRangeUpper(char s) {
        return (s >= 'A' && s <= 'Z');
    }

    public static String caesarCipher(String s, int k) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int kRound = k - (k/25)*25 - (k/25);
            if (isInRangeLower(s.charAt(i))) {
                char character = (char) ((int) s.charAt(i) + kRound);
                if (isInRangeLower(character)) {
                    str.append(character);
                } else {
                    character = (char) (lowerCaseMinRange + (kRound - (lowerCaseMaxRange - (int) s.charAt(i))) - 1);
                    str.append(character);
                }
            } else if (isInRangeUpper(s.charAt(i))) {
                char character = (char) ((int) s.charAt(i) + kRound);
                if (isInRangeUpper(character)) {
                    str.append(character);
                } else {
                    character = (char) (upperCaseMinRange + (kRound - (upperCaseMaxRange - (int) s.charAt(i))) - 1);
                    str.append(character);
                }
            } else {
                str.append(s.charAt(i));
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 2));
        System.out.println(caesarCipher("There's-a-starman-waiting-in-the-sky", 3));
        System.out.println(caesarCipher("123", 3));
        System.out.println(caesarCipher("DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.", 45));

    }

}
