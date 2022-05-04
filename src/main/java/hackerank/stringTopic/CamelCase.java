package hackerank.stringTopic;

public class CamelCase {

    public static int camelCase(String s) {
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("saveChangesInTheEditor"));
    }

}
