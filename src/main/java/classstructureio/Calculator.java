package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Írj be egy egész számot majd nyomj ENTER-t.");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Írj be egy egész számot majd nyomj ENTER-t.");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(num1 + " + " + num2);
        System.out.println(num1 + num2);
    }
}
