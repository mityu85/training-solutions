package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAgeCalculatorTest {

    @Test
    public void testMaxAgeCalculator() {

        MaxAgeCalculator mc = new MaxAgeCalculator();
        List<Trainer> trainers = new ArrayList<>(Arrays.asList(
                new Trainer("John Doe", 25),
                new Trainer("Jane Doe", 30),
                new Trainer("Jack Doe", 50),
                new Trainer("Joe Doe", 50)
        ));

        assertEquals(50, mc.trainerWithMaxAge(trainers).getAge());
    }
}
