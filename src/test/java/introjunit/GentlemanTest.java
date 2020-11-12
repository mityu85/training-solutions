package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
        public void testSayHello() {
        assertEquals(new Gentleman().sayHello("John Doe"), "Hello John Doe");
    }
    @Test
        public void testSayHello2() {
            //Given
                Gentleman gentleman = new Gentleman();
            //When
                String hello = gentleman.sayHello("");
            //Then
                assertEquals(hello, "Hello Anonymous");
        }
}
