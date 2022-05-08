package hackerrank.stringTopic;

public class PalindromeIndex {

    public static int palindromeIndex(String s) {
        //!!!key: only one character to delete -> palindrome
        int start = 0;
        int end = s.length() - 1;

        while (start < end && s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
        }

        if (start >= end) return -1;

        if (isPalindrome(s, start + 1, end)) return start;
        if (isPalindrome(s, start, end - 1)) return end;

        return -1;
    }

    public static boolean isPalindrome(String s, int start, int end) {
    //        int start = 0;
    //        int end = s.length() - 1;
        while (start < end && s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
        }

        return start >= end;
    }

    public static void main(String[] args) {
        System.out.println(palindromeIndex("aaa"));
            System.out.println(palindromeIndex("aaab"));
        System.out.println(palindromeIndex("baa"));
        System.out.println(palindromeIndex("abcdef"));
        System.out.println(palindromeIndex("aobbec"));
        System.out.println(palindromeIndex("bcbc"));

    }

}
