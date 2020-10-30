package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store("apple");
        Store anotherStore = new Store("pear");
        System.out.println("Initial stock of " + store.getProduct() + ": " + store.getStock());
        System.out.println("Initial stock of " + anotherStore.getProduct() + ": " + anotherStore.getStock());
        store.store(10);
        anotherStore.store(15);
        System.out.println(store.getStock() + " " + store.getProduct() + "(s) has arrived to the Store.\n" +
                "Summary: " + store.getStock());
        System.out.println(anotherStore.getStock() + " " + anotherStore.getProduct() + "(s) has arrived to the Store.\n" +
                "Summary: " + anotherStore.getStock());
    }
}
