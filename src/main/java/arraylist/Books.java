package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    public static void main(String[] args) {
        Books books = new Books();
        books.add("Kincskereső Kisködmön");
        books.add("Köszívű ember fiai");
        books.add("Egri Cillagok");
        System.out.println(books.getTitles());
        System.out.println(books.findAllByPrefix("Kincs"));
        books.removeByPrefix("Kincs");
        System.out.println(books.getTitles());
    }

    private List<String> l = new ArrayList<>();

    public void add(String s) {
        l.add(s);
    }

    List<String> findAllByPrefix(String prefix) {
        List<String> f = new ArrayList<>();
        for (String item: l) {
            if (item.startsWith(prefix)) {
                f.add(item);
            }
        }
        return f;
    }

    public List<String> getTitles() {
        return l;
    }

    public void removeByPrefix(String prefix) {
        List<String> r = new ArrayList<>();
        for (String item: l) {
            if (item.startsWith(prefix)) {
                r.add(item);
            }
        }
        l.removeAll(r);
    }
 }
