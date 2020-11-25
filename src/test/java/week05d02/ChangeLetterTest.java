package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
   public void testChangeWovel() {
        assertEquals("*n*s *p*n * t*m*...", new ChangeLetter().changeVowels("Ones upon a time..."));
    }
}
