package hackerrank.stringTopic;

public class MarsExploration {

    public static int marsExploration(String s) {
        int count = 0;
        int j = 1;
        for (int i = 0; i < s.length(); i++) {
            if (j == i) {
                if (s.charAt(i) != 'O') count++;
                j+=3;
            } else {
                if (s.charAt(i) != 'S') count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSTOT"));
    }

}
