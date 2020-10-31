package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("chair", 15000);
        System.out.println("The " + product.getName() + "initial price is " + product.getPrice() + "$.\n" +
                "Please increase the price!");

        Scanner scanner = new Scanner(System.in);

        int increase = scanner.nextInt();
        product.increasePrice(increase);
        scanner.nextLine();
        System.out.println("You increased the price with " + increase + "$. The " +
                product.getName() + " new price is " + product.getPrice());

        System.out.println("Please decrease the price!");
        int decrease = scanner.nextInt();
        product.decreasePrice(decrease);
        System.out.println("You decreased the price with " + decrease + "$. The " +
                product.getName() + " new price is " + product.getPrice());
    }
}
