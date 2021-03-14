package week03d02;

import java.util.Arrays;
import java.util.List;

public class PositionMain {

    public static void main(String[] args) {
        List<Position> positions = Arrays.asList(
                new Position("IT Admin", 250_000),
                new Position("Cleaning manager", 50_000),
                new Position("Driver", 150_000),
                new Position("Builder", 180_000)
        );

        for (Position position: positions) {
            if (position.getBonus() > 150_000) {
                System.out.println(position);
            }
        }
    }
}
