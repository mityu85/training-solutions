package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Egri Csillagok");
        System.out.println(book.getTitle());
        book.setTitle("Kincskereső Kisködmön");
        System.out.println(book.getTitle());
    }
}
