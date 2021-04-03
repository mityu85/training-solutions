package week08d01;

import java.util.*;

public class Sultan {

    private Map<Integer, Jail> jails = new HashMap<>();

    public Map<Integer, Jail> getJails() {
        return jails;
    }

    public Map<Integer, Jail> openDoors() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fillCells(i, j);
            }
        }
        Iterator<Map.Entry<Integer, Jail>> i = jails.entrySet().iterator();
        while (i.hasNext()) {
            if (jails.get(i.next().getKey()).isClosed() == true) {
                i.remove();
            }
        }

        return jails;
    }

    private void fillCells(int i, int j) {
        if (i == 0) {
            jails.put(j+1, new Jail(j + 1, false));
        } else {
            if (j % i == 0) {
                turnKey(j);
            }
        }
    }

    private void turnKey(int j) {
        if (jails.get(j+1).isClosed()) {
            jails.get(j+1).setClosed(false);
        } else {
            jails.get(j+1).setClosed(true);
        }
    }
}
