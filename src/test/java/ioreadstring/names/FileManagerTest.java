package ioreadstring.names;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FileManagerTest {


    private FileManager fm = new FileManager();

    @Test
    public void createClassTest() {
        assertEquals("humanNames.txt", fm.getPATH().getFileName().toString());
        assertEquals(0, fm.getHumans().size());
    }


    @Test
    public void readFromFileTest() {
        fm.readFromFile();
        assertEquals(3, fm.getHumans().size());
        assertEquals("Jane", fm.getHumans().get(1).getFirstName());
    }
}
