package hackerrank.stringTopic;

import java.util.Arrays;
import java.util.List;

public class StrongPassword {

    public static boolean isNumber(char s) {
        return (s >= '0' && s <= '9');
    }

    public static boolean isLowerCase(char s) {
        return (s >= 'a' && s <= 'z');
    }

    public static boolean isUpperCase(char s) {
        return (s >= 'A' && s <= 'Z');
    }

    public static boolean isSpecialCharacters(char s) {
        List<Character> listSpecialCharacter = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');
        return listSpecialCharacter.contains(s);
    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int differenceLength = n - 6;

        int hasNumber = 1;
        int hasLower = 1;
        int hasUpper = 1;
        int hasSpecial = 1;
        int minNumNeed = 0;

        for (int i = 0; i < n; i++) {
            if (isNumber(password.charAt(i))) hasNumber = 0;
            if (isLowerCase(password.charAt(i))) hasLower = 0;
            if (isUpperCase(password.charAt(i))) hasUpper = 0;
            if (isSpecialCharacters(password.charAt(i))) hasSpecial = 0;

            minNumNeed = hasNumber + hasLower + hasSpecial + hasUpper;
        }

        return (differenceLength >= minNumNeed) ? minNumNeed : Math.max(Math.abs(differenceLength), Math.abs(minNumNeed));

    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(11, "#HackerRank"));
    }

}
