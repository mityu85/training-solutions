package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        Book book = new Book();
        System.out.println(book);

        Book emptyBook = null;
        System.out.println(emptyBook);

        boolean isNull = emptyBook == null ? true : false;
        System.out.println(isNull);

        Book book1 = book;
        System.out.println(book1);
        book1 = null;
        System.out.println(book1);
        Book book2 = new Book();
        book1 = book2;
        System.out.println(book1);
        Book anotherBook = new Book();
        boolean result = book1 == anotherBook ? true : false;
        System.out.println(result);
        System.out.println(anotherBook instanceof Book);
        Book book3 = new Book();

        Book[] arrayOfBooks = {book, book1, book3};

        List<Book> books = Arrays.asList(book, book1, book3);
        List<Book> anotherBooks = new ArrayList<>();
        anotherBooks.add(book);
        anotherBooks.add(book1);
        anotherBooks.add(book3);
    }
}
