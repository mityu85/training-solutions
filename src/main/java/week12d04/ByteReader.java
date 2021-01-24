package week12d04;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteReader {

    public void byteReader() {
        Path path = Path.of("src/main/resources/secret.dat");
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b: bytes) {
                char c = (char)(b + 10);
                System.out.print(c);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }
}
