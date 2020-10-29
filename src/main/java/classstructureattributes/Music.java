package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        System.out.println("What' your favorite band name?");
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        song.band = scanner.nextLine();
        System.out.println("What is your favorite " + song.band + "'s track title?");
        song.title = scanner.nextLine();
        System.out.println("What's the " + song.title + "'s length in minutes?" );
        song.length = scanner.nextInt();
        scanner.nextLine();
        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)");
    }
}
