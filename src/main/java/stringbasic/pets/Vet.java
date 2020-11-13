package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    private boolean areEquals(Pet pet) {
        for (Pet item: pets) {
            if (item.getRegNumber() == pet.getRegNumber()) {
                return true;
            }
        }
        return false;
    }

    public void add(Pet pet) {
        if (!areEquals(pet)) {
            pets.add(pet);
        }
    }
}
