package filescanner.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void loadFromFile() {

        try (Scanner sc = new Scanner(Library.class.getResourceAsStream("/books.txt")).useDelimiter(";|(\r\n)")) {
            while(sc.hasNextLine()) {
                String regNum = sc.next();
                String author = sc.next();
                String title = sc.next();
                int yearOfPublish = sc.nextInt();
                books.add(new Book(regNum, author, title, yearOfPublish));
            }
        }
    }
}
