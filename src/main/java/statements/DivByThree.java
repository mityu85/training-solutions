package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {

        System.out.println("Please give an integer:");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        String query = numb % 3 == 0 ? "can" : "cannot";
        System.out.println(numb + " " + query + " divide with 3.");
    }
}
