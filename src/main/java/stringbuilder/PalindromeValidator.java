package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {

        if (word == null) {
            throw new IllegalArgumentException("Illegal Argument!");
        }
        StringBuilder sb = new StringBuilder(word.toLowerCase());
        if (word.equalsIgnoreCase(sb.reverse().toString())) {
            return true;
        }
        return false;
    }
}
