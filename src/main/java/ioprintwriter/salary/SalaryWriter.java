package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {

    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String name: names) {
                if (name.startsWith("Dr")) {
                    pw.println(name + ": " + 500_000);
                } else if (name.startsWith("Mr") || name.startsWith("Ms")) {
                    pw.println(name + ": " + 200_000);
                } else {
                    pw.println(name + ": " + 100_000);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not write", e);
        }
    }
}
