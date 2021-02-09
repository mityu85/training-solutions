package week08d02;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LotteryTest {

    @Test
    public void testLottery() {
        Lottery lottery = new Lottery();
        assertEquals(5, lottery.getNumbers().size());
    }
}
