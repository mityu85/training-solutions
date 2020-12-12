package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(getActualPrimaryDamage()*2);
    }

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (getPosition().distance(enemy.getPosition()) < 2) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
