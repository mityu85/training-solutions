package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store("apple");
        Store anotherStore = new Store("pear");
        System.out.println("Initial stock of " + store.getProduct() + ": " + store.getStock());
        System.out.println("Initial stock of " + anotherStore.getProduct() + ": " + anotherStore.getStock());

        int storeTempStock = store.getStock(); // value of the difference before the change
        System.out.println(store.store(10)-storeTempStock + " " + store.getProduct() + "(s) has been arrived to the Store.\n" +
                "Summary: " + store.getStock());

        int anotherStoreTempStock = anotherStore.getStock(); //value of the difference before the change
        System.out.println(anotherStore.store(15)-anotherStoreTempStock + " " + anotherStore.getProduct() + "(s) has been arrived to the anotherStore.\n" +
                "Summary: " + anotherStore.getStock());

        int dispatchTempStock = store.getStock(); //value of the difference before the change
        System.out.println((store.dispatch(5)-dispatchTempStock)*-1 + " " + store.getProduct() + "(s) has been sold to the Store.\n" +
                "Summary: " + store.getStock());

        int anotherDispatchTempStock = anotherStore.getStock(); //value of the difference before the change
        System.out.println((anotherStore.dispatch(5)-anotherDispatchTempStock)*-1 + " " + anotherStore.getProduct() + "(s) has been sold to the anotherStore.\n" +
                "Summary: " + anotherStore.getStock());
    }
}
