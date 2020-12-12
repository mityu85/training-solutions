package interfaces.animal;

public class Worm implements Animal {
    @Override
    public int getNumberofLegs() {
        return 0;
    }

    @Override
    public String getName() {
        return "Worm";
    }
}
