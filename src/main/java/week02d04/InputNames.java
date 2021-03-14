package week02d04;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        String result = "";
        for (int i = 1; i < 6; i++) {
            System.out.println("Type a name:");
            names[i-1] = scanner.next();
            result += i + "." + " " + names[i-1] + "\n";
        }
        System.out.println(result);
    }
}
