package methodoverloading.pub;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoodPubs {

    private List<Pub> goodPubs = new ArrayList<>();

    public ListOfGoodPubs(List<Pub> goodPubs) {
        if (goodPubs == null || goodPubs.isEmpty()) {
            throw new IllegalArgumentException("Empty pubList!");
        }
        this.goodPubs = goodPubs;
    }

    public Pub findTheBest() {
        Pub resultPub = null;
        for (Pub goodPub: goodPubs) {
            if (resultPub == null) {
                resultPub = goodPub;
            }
            if (resultPub.getTime().isEarlier(goodPub.getTime())) {
                resultPub = goodPub;
            }
        }
        return resultPub;
    }
}
