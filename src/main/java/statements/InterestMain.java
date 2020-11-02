package statements;

import java.util.Scanner;

public class InterestMain {
    public static void main(String[] args) {

        System.out.println("Please give the amount of foundation:");
        Scanner scanner = new Scanner(System.in);
        int fund = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please give the value of interest rate:");
        int rate = scanner.nextInt();
        scanner.nextLine();
        Investment investment = new Investment(fund, rate);

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam 50 napra: " + investment.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + investment.close(80));
        System.out.println("Kivett összeg 90 nap után: " + investment.close(90));
    }
}
