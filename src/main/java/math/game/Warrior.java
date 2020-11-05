package math.game;

import java.util.Random;

public class Warrior {

    private String name;
    private int stamina;
    private double skill;
    private Point position;
    private Random rnd = new Random();

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        stamina = rnd.nextInt(81)+20;
        skill = rnd.nextDouble();

    }

    public Point getPosition() {
        return position;
    }

    public void move(Warrior warrior) {
        int newX = position.getX();
        int newY = position.getY();
        if (warrior.getPosition().getX() - position.getX() > 0) {
            newX++;
        } else {
            if (warrior.getPosition().getX() - position.getX() < 0) {
                newX--;
            }
        }
        if (warrior.getPosition().getY() - position.getY() > 0) {
            newY++;
        } else {
            if (warrior.getPosition().getY() - position.getY() < 0) {
                newY--;
            }
        }
        position = new Point(newX, newY);
    }

    public void attack(Warrior warrior) {
        int staminaRnd = rnd.nextInt(3)+1;
        if (rnd.nextDouble() < skill) {
            warrior.stamina -= staminaRnd;
        }
    }

    public double distance(Warrior warrior) {
        return position.distance(warrior.position);
    }

    public boolean isAlive() {
        return stamina <= 0 ? false : true;
    }

    public String toString(){
        return name + ": " + "(" + position.getX() + ", " + position.getY() + ") " + stamina;
    }
}
