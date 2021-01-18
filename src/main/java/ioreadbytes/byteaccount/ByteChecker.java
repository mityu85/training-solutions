package ioreadbytes.byteaccount;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    private void createDataWithA(Writer writer) {
        PrintWriter pw = new PrintWriter(writer);
        for (int i = 0; i < 5500; i++) {
            pw.print('a');
        }
    }

    private void createFile(Path file) {
        try (BufferedWriter bw = new BufferedWriter(Files.newBufferedWriter(Path.of("src/main/resources/" + file)))) {
            createDataWithA(bw);
        } catch (IOException e) {
            throw new IllegalStateException("File can not create", e);
        }
    }

    public int byteCounter(Path file) {
        createFile(file);
        int sum = 0;
        try (InputStream is = new BufferedInputStream(Files.newInputStream(Path.of("src/main/resources/" + file)))) {
            byte[] bytes = new byte[1000];
            int size;
            while ((size = is.read(bytes)) > 0) {
                sum += size;
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
        return sum;
    }
}
