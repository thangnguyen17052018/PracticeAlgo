package hackerank.stringTopic;

public class SuperReduceString {

    public static String superReducedString(String s) {
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length()) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    str.delete(i, i+2);
                    i = -1;
                }
            }
        }

        return (str.length() > 0) ? str.toString() : "Empty String";
    }

    public static void main(String[] args) {
        String s = "baab";
        System.out.println(superReducedString(s));
    }

}
