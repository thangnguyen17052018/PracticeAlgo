package MrDuyExcercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class printRandomToN {

    public static void printRandomTo(int n) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            listNumber.add(i);
        }

        Collections.shuffle(listNumber);

        listNumber.forEach(number -> System.out.print(number + " "));
    }

    public static void main(String[] args) {
        printRandomTo(8);
    }

}
