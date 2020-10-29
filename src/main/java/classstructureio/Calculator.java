package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Give a number and press Enter!");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give a number and press Enter!");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(num1 + " + " + num2);
        System.out.println(num1 + num2);
    }
}
