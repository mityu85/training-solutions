package week08d01;

import java.util.Locale;
import java.util.Scanner;

public class Robot {

    private Position position;

    public Robot(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void up() {
        position = new Position(position.getX(), position.getY()+1);
    }

    public void down() {
        position = new Position(position.getX(), position.getY()-1);
    }

    public void left() {
        position = new Position(position.getX()-1, position.getY());
    }

    public void right() {
        position = new Position(position.getX()+1, position.getY());
    }

    public String move(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'f':
                    up();
                    break;
                case 'l':
                    down();
                    break;
                case 'b':
                    left();
                    break;
                case 'j':
                    right();
                    break;
                default:
                    throw new IllegalArgumentException("Please choose from the following letters: " +
                            "(F = up, L = down, B = left, J = right)");
            }
        }
        return position.toString();
    }
}
