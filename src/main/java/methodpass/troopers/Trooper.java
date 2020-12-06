package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position;

    private boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public Trooper(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Trooper name is null!");
        }
        this.name = name;
        position = new Position(0,0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target is null!");
        }
        position = target;
    }

    public double distanceFrom(Position target) {
        return position.distanceFrom(target);
    }
}
