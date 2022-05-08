package hackerrank.stringTopic;

public class FunnyString {

    public static String funnyString(String s) {
        StringBuilder r = new StringBuilder(s);
        r.reverse();
        System.out.println(r);
        for (int i = 0; i < s.length() - 1; i++) {
            int sAscii = (int) s.charAt(i + 1) - (int) s.charAt(i);
            int rAscii = (int) r.charAt(i + 1) - (int) r.charAt(i);
            if (Math.abs(sAscii) != Math.abs(rAscii)) return "Not Funny";
        }

        return "Funny";
    }

    public static void main(String[] args) {
        System.out.println(funnyString("abc"));
    }

}
