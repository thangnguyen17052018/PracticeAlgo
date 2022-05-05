package hackerank.stringTopic;

public class SeparateTheNumbers {

    public static void separateNumbers(String s) {

        boolean isValid = false;

        for (int i = 0; i < s.length()/2; i++) {
            String firstNumber = s.substring(0, i + 1);
            Long firstNumberValue = Long.parseLong(firstNumber);
            firstNumberValue++;
            String expectedNextNumber = firstNumberValue.toString();
            int traverseIndex = expectedNextNumber.length() + 1 + i;

            int count = firstNumber.length();
            int j = i;
            while (s.substring(j + 1, traverseIndex).equals(expectedNextNumber)) {
                count += expectedNextNumber.length();
                j+= expectedNextNumber.length();
                Long nextNumberValue = Long.parseLong(expectedNextNumber);
                nextNumberValue++;
                expectedNextNumber = nextNumberValue.toString();
                traverseIndex += expectedNextNumber.length();

                if (traverseIndex > s.length()) break;
            }

            if (count == s.length()) {
                System.out.println("YES " + firstNumber);
                isValid = true;
                break;
            }
        }

        if (!isValid) System.out.println("NO");

    }

    public static void main(String[] args) {
        separateNumbers("99100");
        separateNumbers("1234");
        separateNumbers("91011");
        separateNumbers("99910001001");
        separateNumbers("7891011");
        separateNumbers("9899100");
        separateNumbers("999100010001");
        separateNumbers("1");
        separateNumbers("13");
        separateNumbers("010203");
        separateNumbers("101103");
        separateNumbers("78798081828384858687888990919293");

    }

}
