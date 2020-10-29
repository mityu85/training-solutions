package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        client.name = scanner.nextLine();
        System.out.println("What's your year of birth?");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's your address?");
        client.address = scanner.nextLine();
        System.out.println("Name: " + client.name + "\n" +
                "Year of birth: " + client.year + "\n" +
                "Address: " + client.address);
    }
}
