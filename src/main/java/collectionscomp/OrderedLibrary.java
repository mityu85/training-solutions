package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {

    List<Book> libraryBooks = new LinkedList<>();

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle() {

        List<Book> orderedList = new ArrayList<>(libraryBooks);
        Collections.sort(orderedList);

        return orderedList;
    }

    public List<Book> orderedByAuthor() {

        List<Book> orderedList = new ArrayList<>(libraryBooks);
        Collections.sort(orderedList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });

        return orderedList;
    }

    public List<String> orderedByTitleLocale(Locale locale) {

        List<String> orderedList = new ArrayList<>();
        for (Book book : libraryBooks) {
            orderedList.add(book.getTitle());
        }

        Collator hungarianCollator = Collator.getInstance(locale);
        hungarianCollator.setStrength(Collator.PRIMARY);
        Collections.sort(orderedList, hungarianCollator);

        return orderedList;
    }
}