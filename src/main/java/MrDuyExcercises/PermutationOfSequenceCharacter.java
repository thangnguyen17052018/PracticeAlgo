package MrDuyExcercises;

import java.util.Scanner;

public class PermutationOfSequenceCharacter {
    public static int n;

    public static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    public static void try_back(String str, int i) {
        if (i == n - 1) {
            System.out.println(str);
            return ;
        } else {
            for (int j = i; j < n; j++) {
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
        n = str.length();
        try_back(str , 0);
    }

}
