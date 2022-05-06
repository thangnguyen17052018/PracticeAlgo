package MrDuyExcercises;

import java.util.Scanner;

public class PermutationOfSequenceCharacter {
    public static JazzySpellChecker jazzySpellChecker = new JazzySpellChecker();
    public static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    public static void try_back(String str, int i) {
        if (i == str.length() - 1) {
            try {
                if (jazzySpellChecker.checkSpelling(str.toLowerCase()) == -1) {
                    System.out.println(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ;
        } else {
            for (int j = i; j < str.length(); j++) {
                str = swap(str, i, j);
                try_back(str, i + 1);
                str = swap(str, i ,j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        try_back(str , 0);
    }



}
