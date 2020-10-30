package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Gárdonyi Géza", "Egri Csillagok");
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        book.register("ABC1285");
        Book anotherBook = new Book("Fekete István", "Tüskevár");
        System.out.println("Author: " + anotherBook.getAuthor());
        System.out.println("Title: " + anotherBook.getTitle());
        anotherBook.register("GAH8978");
    }
}
