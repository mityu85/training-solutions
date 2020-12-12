package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    private Animal duck = new Duck();
    private Animal lion = new Lion();
    private Animal worm = new Worm();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfLegs() {
        int legs = 0;
        for (Animal animal: animals) {
            legs += animal.getNumberofLegs();
        }
        return legs;
    }
}
