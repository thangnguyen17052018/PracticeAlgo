package hackerrank.stringTopic;

public class BeautifulBinaryString {

    public static int beautifulBinaryString(String s) {
        int count = 0;

        for (int i = 1; i < s.length() -1; i++) {
            if (s.charAt(i-1) == '0' && s.charAt(i) == '1' && s.charAt(i+1) == '0') {
                count++;
                i+=2;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("01100"));
    }

}
