package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint;
    private Random random;

    private int getActualDefense() {
        int rnd = random.nextInt(6);
        return rnd;
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    public Character(Point position, Random random) {
        this.position = position;
        this.hitPoint = 100;
        this.random = new Random();
    }

    protected int getActualPrimaryDamage() {
        int rnd = random.nextInt(10)+1;
        return rnd;
    }

    protected void hit(Character enemy, int damage) {
        if (getActualDefense() < damage) {
            decreaseHitPoint(damage);
        }
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    public abstract void secondaryAttack(Character enemy);
}
