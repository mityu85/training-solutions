package interfacedefaultmethods.print;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    @Test
    public void printNewsPaper() {
        NewsPaper newspaper = new NewsPaper();
        newspaper.addPage("Page1");
        assertEquals("Page1\n", new Printer().print(newspaper));
    }
}
