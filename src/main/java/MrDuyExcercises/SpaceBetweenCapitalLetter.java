package MrDuyExcercises;

public class SpaceBetweenCapitalLetter {

    public static String spaceBetweenCapitalLetter(String str) {
        StringBuilder sentence = new StringBuilder();
        char[] s = str.toCharArray();

        for (int i = 0; i < s.length; i++) {
            sentence.append(s[i]);

            if (i < s.length - 1) {
                if ((s[i + 1] >= 'A' && s[i + 1] <= 'Z') || (s[i+1] >= '0' && s[i+1] <= '9' && (int)s[i] > 65)) {
                    sentence.append(' ');
                }
            }
        }

        return sentence.toString();
    }

    public static void main(String[] args) {
        System.out.println(spaceBetweenCapitalLetter("HelloToTheXWorldForThe1000thTime"));
        System.out.println(spaceBetweenCapitalLetter("HelloToTheXWorldForThe1000thTime10"));
        System.out.println(spaceBetweenCapitalLetter("HelloToTheXWorldForThe1000thTime1"));
        System.out.println(spaceBetweenCapitalLetter("10HelloToTheXWorld1ForThe1000thTime"));

        System.out.println((int)'A');
    }

}
