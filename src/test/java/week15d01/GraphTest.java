package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphTest {

    Graph graph = new Graph();

    @Test
    public void maxValueTest() {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 12);
        m.put(1, 15);
        m.put(3, 14);
        m.put(2, 1);
        m.put(5, 26);

        assertEquals(26, graph.maxValue(m));
    }
}
