package hackerank.stringTopic;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

    public static int makingAnagrams(String s1, String s2) {
        Map<Character, Integer> hashMap = new HashMap<>();

        int numberCheck = 0;

        for (int i = 0; i < s1.length(); i++) {
            Character character = s1.charAt(i);

            if (hashMap.containsKey(character)) {
                int count = hashMap.get(character);
                hashMap.put(character, ++count);
            } else {
                hashMap.put(character, 1);
            }
        }

        System.out.println(hashMap);

        for (int i = 0; i < s2.length(); i++) {
            Character character = s2.charAt(i);

            if (hashMap.containsKey(character)) {
                int countChar = hashMap.get(character);
                if (countChar > 0) {
                    numberCheck++;
                }
                hashMap.put(character, --countChar);
            }
        }

        return s1.length() - numberCheck + (s2.length() - numberCheck);
    }

    public static void main(String[] args) {
        System.out.println(makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa"));
        System.out.println(makingAnagrams("cde", "abc"));
    }

}
