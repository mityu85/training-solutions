package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = new HashSet<>(libraryBooks);
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }

    public Book findBookByRegNumber(int regNumber) {

        Book book;
        Iterator<Book> b = libraryBooks.iterator();
        while (b.hasNext()) {
            book = b.next();
            if (book.getRegNumber() == regNumber) {
                return book;
            }
        }
        throw new MissingBookException("No books found with regnumber:" + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        Book book;
        Iterator<Book> b = libraryBooks.iterator();
        while (b.hasNext()) {
            book = b.next();
            if (book.getRegNumber() == regNumber) {
                b.remove();
                return regNumber;
            }
        }

        throw new MissingBookException("No books found with regnumber:" + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author) {
        boolean isAuthor = false;
        Set<Book> books = new HashSet<>();
        Book book;
        Iterator<Book> b = libraryBooks.iterator();
        while (b.hasNext()) {
            book = b.next();
            if (book.getAuthor().equals(author)) {
                books.add(book);
                isAuthor = true;
            }
        }
        if (!isAuthor) {
            throw new MissingBookException("No books found by " + author);
        } else {
            return books;
        }
    }

}
