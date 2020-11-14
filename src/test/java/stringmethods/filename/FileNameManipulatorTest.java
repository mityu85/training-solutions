package stringmethods.filename;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileNameManipulatorTest {

    @Test
    public void invalidParametersShouldThrowExceptionIfEmptyString() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().findLastCharacter("");
        });
        assertEquals("Empty string!", ex.getMessage());

    }

    @Test
    public void invalidParametersShouldThrowExceptionIfWhiteSpaceOnly() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().changeExtensionToLowerCase("\t\n\r ");
        });
        assertEquals("Empty string!", ex.getMessage());
    }

    @Test
    public void invalidParametersShouldThrowExceptionJustPoint() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().changeExtensionToLowerCase(".");
        });
        assertEquals("Empty string!", ex.getMessage());
    }

    @Test
    public void invalidParametersShouldThrowExceptionJustExtension() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().changeExtensionToLowerCase(".java");
        });
        assertEquals("Invalid argument!", ex.getMessage());
    }

    @Test
    public void invalidFileNameEmptyString() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().findFileExtension("\t\n\r");
        });
        assertEquals("Empty string!", ex.getMessage());
    }

}
