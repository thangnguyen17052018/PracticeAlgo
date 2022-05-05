package hackerank.stringTopic;

public class TheLoveLetterMystery {

    public static int theLoveLetterMystery(String s) {
        int countReduce = 0;

        for (int i = 0; i < s.length()/2; i++) {
            countReduce += Math.abs((int) s.charAt(i) - (int) s.charAt(s.length() - i - 1));
        }

        return countReduce;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abcba"));
        System.out.println(theLoveLetterMystery("abc"));
        System.out.println(theLoveLetterMystery("abcd"));
        System.out.println(theLoveLetterMystery("cba"));
        System.out.println(theLoveLetterMystery("cde"));
        System.out.println(theLoveLetterMystery("awertr"));
    }

}
