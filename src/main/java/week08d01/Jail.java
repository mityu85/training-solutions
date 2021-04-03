package week08d01;

public class Jail {

    private int id;
    private boolean closed;

    public Jail(int id, boolean closed) {
        this.id = id;
        this.closed = closed;
    }

    public boolean isClosed() {
        return closed;
    }

    public int getId() {
        return id;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    @Override
    public String toString() {
        return "Jail{" +
                "closed=" + closed +
                ", id=" + id +
                '}';
    }
}
