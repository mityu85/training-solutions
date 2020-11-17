package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PalindromeValidatorTest {

    @Test
    public void palindromeTest() {
        assertTrue(new PalindromeValidator().isPalindrome("Gézakékazég"));
    }

    @Test
    public void nullParameterException() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new PalindromeValidator().isPalindrome(null));
        assertEquals("Illegal Argument!", ex.getMessage());
    }
}
