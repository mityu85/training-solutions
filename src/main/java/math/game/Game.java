package math.game;

public class Game {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior("John Doe", new Point(5, 7));
        Warrior warrior2 = new Warrior("Jane Doe", new Point(1, 9));

        for (int i = 1; warrior1.isAlive() && warrior2.isAlive(); i++) {

            System.out.println("Round: " + i);
            System.out.println(warrior1.toString());
            System.out.println(warrior2.toString());
            if (warrior1.distance(warrior2) > 0) {
                warrior1.move(warrior2);
                warrior2.move(warrior1);
            } else {
                warrior1.attack(warrior2);
                if (warrior2.isAlive()) {
                    warrior2.attack(warrior1);
                }
            }
        }
        System.out.println("Winner: " + (warrior1.isAlive() ? warrior1.toString() : warrior2.toString()));
    }
}
