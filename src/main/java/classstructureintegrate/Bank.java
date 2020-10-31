package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        BankAccount Michael = new BankAccount("10734567-00000000-00001234",
                "Michael Toth", 289300);
        BankAccount Steven = new BankAccount("10798765-00000000-00006789",
                "Steven Viczian", 1500000);
        System.out.println("The following accounts are exist in the system:\n" +
                Michael.getInfo() + "\n" + Steven.getInfo());
        System.out.println("It seems like Steven has a lot of money " +
                "so how many HUF should be transferred to Michael?");

        Scanner scanner = new Scanner(System.in);
        int huf = scanner.nextInt();
        scanner.nextLine();

        Steven.transfer(Michael, huf);
        System.out.println("The new balance of each account in the system:\n" +
                Michael.getInfo() + "\n" + Steven.getInfo());

        System.out.println("How many HUF you want to deposit to Michael's account?");
        huf = scanner.nextInt();
        scanner.nextLine();
        Michael.deposit(huf);
        System.out.println("The new balance of each account in the system:\n" +
                Michael.getInfo() + "\n" + Steven.getInfo());

        System.out.println("How many HUF you want to deposit to Steven's account?");
        huf = scanner.nextInt();
        scanner.nextLine();
        Steven.deposit(huf);
        System.out.println("The new balance of each account in the system:\n" +
                Michael.getInfo() + "\n" + Steven.getInfo());

        System.out.println("How many HUF you want to withdraw from Michael's account?");
        huf = scanner.nextInt();
        scanner.nextLine();
        Michael.withdraw(huf);
        System.out.println("The new balance of each account in the system:\n" +
                Michael.getInfo() + "\n" + Steven.getInfo());

        System.out.println("How many HUF you want to withdraw from Steven's account?");
        huf = scanner.nextInt();
        scanner.nextLine();
        Steven.withdraw(huf);
        System.out.println("The new balance of each account in the system:\n" +
                Michael.getInfo() + "\n" + Steven.getInfo());
    }
}
