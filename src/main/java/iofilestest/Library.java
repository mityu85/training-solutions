package iofilestest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return new ArrayList<>(bookList);
    }

    public void add(Book... books) {
        if (bookList.isEmpty()) {
            for (Book book: books) {
                bookList.add(book);
            }
        } else {
            boolean isHave = false;
            for (int i = 0; i < books.length; i++) {
                for (int j = 0; j < bookList.size(); j++) {
                    if (books[i].getTitle().equals(bookList.get(j).getTitle())) {
                        isHave = true;
                        break;
                    }
                }
                if (isHave) {
                    break;
                }
                bookList.add(books[i]);
            }
        }
    }

    public void saveBooks(Path path) {
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            for (Book bookItem: bookList) {
                bw.write(bookItem.getAuthor() + ": " + bookItem.getTitle());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not write", e);
        }
    }

    public void loadBooks(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(":");
                add(new Book(temp[1].trim(), temp[0].trim()));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }
}
