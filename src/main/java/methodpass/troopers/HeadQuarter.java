package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    private boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    private Trooper findTrooperByName(String name) {
        Trooper foundTrooper = null;
        for (Trooper trooper: troopers) {
            if (trooper.getName().equals(name)) {
                foundTrooper = trooper;
            }
        }
        return foundTrooper;
    }

    private Trooper findClosestTrooper(Position target) {
        Trooper closestTrooper = null;
        for (Trooper trooper: troopers) {
            if (closestTrooper == null) {
                closestTrooper = trooper;
            }
            if (trooper.distanceFrom(target) < closestTrooper.distanceFrom(target)) {
                closestTrooper = trooper;
            }
        }
        return closestTrooper;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("Trooper object is null!");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name is empty!");
        }
        if (target == null) {
            throw new IllegalArgumentException("Target object is empty!");
        }
        moveTrooper(findTrooperByName(name), target);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target object is empty!");
        }
        moveTrooper(findClosestTrooper(target), target);
    }
}
