package iofilestest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @TempDir
    Path tempDir;

    Library library = new Library();

    @Test
    public void testWrite() throws IOException {
        Path path = Files.createFile(tempDir.resolve("booklist.txt"));
        library.add(
                new Book("Apple", "Steve Jobs"),
                new Book("Windows", "Bill Gates"),
                new Book("Life", "God")
        );
        assertEquals(3, library.getBookList().size());

        library.add(new Book("Apple", "Steve Jobs"));
        library.add(new Book("Rockets", "Elon Musk"));
        library.add(new Book("Rockets", "Elon Musk"));

        assertEquals(4, library.getBookList().size());

        library.saveBooks(path);
        library.loadBooks(path);
        assertEquals(4, library.getBookList().size());
        assertEquals("Rockets", library.getBookList().get(3).getTitle());
    }
}
