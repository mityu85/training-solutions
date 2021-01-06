package week06d05.senior;

public class Bottle {

    private BottleType type;
    private int filledUntil;

    public Bottle(BottleType type) {
        this.type = type;
    }

    public BottleType getType() {
        return type;
    }

    public int getFilledUntil() {
        return filledUntil;
    }

    public static Bottle of(BottleType bottleType) {
        return new Bottle(bottleType);
    }

    public void fill(int fillAmount) {
        if (filledUntil + fillAmount <= type.getMaximumAmount()) {
            filledUntil += fillAmount;
        } else {
            throw new IllegalStateException("The Bottle is full");
        }
    }
}
