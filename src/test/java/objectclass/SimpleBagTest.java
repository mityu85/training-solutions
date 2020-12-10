package objectclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleBagTest {

    @Test
    public void testConstructor() {
        //Given
        SimpleBag bag = new SimpleBag();
        //Then
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.size());
    }


    @Test
    public void testPut() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem("alma");
        bag.putItem((new Book("Rejtő Jenő", "Az ellopott cirkáló")));
        bag.putItem(new Beer("Borsodi", 239));
        //Then
        assertEquals(false, bag.isEmpty());
        assertEquals(3, bag.size());

    }

    @Test
    public void testIteration() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem(new Beer("Heineken", 250));
        bag.putItem(new Book("Rejtő Jenő", "Az ellopott cirkáló"));
        bag.putItem(new Beer("Borsodi", 239));
        //Then
        assertEquals(2, bag.getCursor());
    }
}
