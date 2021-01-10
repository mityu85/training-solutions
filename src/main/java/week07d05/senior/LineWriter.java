package week07d05.senior;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class LineWriter {

    public void lineWriter() {
        System.out.println("File name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String[] temp = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Write a line:");
            String line = scanner.nextLine();
            temp[i] = line;
        }
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("src/main/resources/" + fileName))) {
            for (String item: temp) {
                bw.write(item + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not write", e);
        }
    }
}
