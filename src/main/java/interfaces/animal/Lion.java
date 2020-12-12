package interfaces.animal;

public class Lion implements Animal {
    @Override
    public int getNumberofLegs() {
        return 4;
    }

    @Override
    public String getName() {
        return "Lion";
    }
}
