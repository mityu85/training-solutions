package classstructureio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What's your e-mail address? ");
        String email = scanner.nextLine();
        System.out.println("The following personal data has been registered:\n" +
                "name: " + name + "\n" + "e-mail: " + email);
    }
}
