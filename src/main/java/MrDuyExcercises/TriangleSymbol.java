package MrDuyExcercises;

import java.util.ArrayList;
import java.util.List;

public class TriangleSymbol {

    public static void printTriangle(int n) {
        List<Character> characterList = initCharacters();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(characterList.get(j % characterList.size()));
            }
            System.out.println();
        }
    }

    private static List<Character> initCharacters() {
        List<Character> characters = new ArrayList<>();
        characters.add('*');
        characters.add('#');
        characters.add('@');
        characters.add('&');
        return characters;
    }

    public static void main(String[] args) {
        printTriangle(10);
    }

}
