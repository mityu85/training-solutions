package exceptionclass.course;

public class Course {

    private String name;
    private SimpleTime begin;

    private boolean isEmpty(String str) {
        return  str == null || str.isEmpty();
    }

    public Course(String name, SimpleTime begin) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException();
        }
        if (begin == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        String s = "";
        if (Integer.parseInt(begin.toString().substring(3)) < 10) {
            s = String.format("%s: %s", begin.toString().substring(0, 3) +
                            "0" +
                            begin.toString().substring(3)
                    , name);
        } else {
            s = begin + name;
        }
        return s;
    }
}
