package controladvanced;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> findDuplicates(List<Integer> numbList) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbList.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (numbList.get(i).equals(numbList.get(j))) {
                    result.add(numbList.get(i));
                    break;
                }
            }
        }
        return result;
    }
}
