package filescanner.bucketlist;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(BucketList.class.getResourceAsStream("/bucketlist.txt"))) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
    }
}
