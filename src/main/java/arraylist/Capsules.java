package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capsules {

    public static void main(String[] args) {

        Capsules capsules = new Capsules();
        System.out.println(capsules.getColors());
        capsules.addFirst("pink");
        capsules.addFirst("green");
        System.out.println(capsules.getColors());
        capsules.addLast("orange");
        System.out.println(capsules.getColors());
        capsules.addLast("blue");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());

        System.out.println();

        List<String> list = new ArrayList<>();
        list = capsules.getColors();
        System.out.println(list);
        list.clear();
        System.out.println(capsules.getColors());
    }

    private List<String> l = new ArrayList<>();

    public List<String> getColors() {
        return l;
    }

    public void addLast(String s) {
        l.add(s);
    }

    public void removeLast() {
        int size = l.size();
        l.remove(size-1);
    }

    public void addFirst(String s) {
        l.add(0, s);
    }

    public void removeFirst() {
        l.remove(0);
    }
}
