package week13d04;


import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;

public class TemplateMergerTest {

    TemplateMerger tm = new TemplateMerger();

    @Test
    public void testMerge() {
        System.out.println(tm.merge(Path.of("src/main/resources/employeesdata.txt"), Arrays.asList()));
    }
}
