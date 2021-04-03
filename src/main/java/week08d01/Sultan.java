package week08d01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sultan {

    private List<Jail> jails = new ArrayList<>();

    public List<Jail> openDoors() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                fillCells(i, j);
            }
        }
        Iterator<Jail> i = jails.iterator();
        while (i.hasNext()) {
            if (i.next().isClosed() == true) {
                i.remove();
            }
        }

        return jails;
    }

    private void fillCells(int i, int j) {
        if (i == 0) {
            jails.add(new Jail(j + 1, false));
        } else {
            if (j % i == 0) {
                turnKey(j);
            }
        }
    }

    private void turnKey(int j) {
        if (jails.get(j).isClosed()) {
            jails.get(j).setClosed(false);
        } else {
            jails.get(j).setClosed(true);
        }
    }
}
