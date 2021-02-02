package week13d04;

import java.nio.file.Path;
import java.util.Arrays;

public class TemplateMergerMain {
    public static void main(String[] args) {
        TemplateMerger tm = new TemplateMerger();
        System.out.println(tm.merge(Path.of("src/main/resources/employeesdata.txt"), Arrays.asList()));
    }
}
