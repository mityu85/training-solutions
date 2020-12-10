package introinheritance.basket;

public class Item {

    private String barcode;
    private double nettoPrice;
    private int vatPercent;

    public double getTaxAmount() {
        return nettoPrice * vatPercent / 100.0;
    }// a nettoPrice és a vatPercent alapján kiszámolja az adó összegét

    public double getNettoPrice() {
        return nettoPrice;
    }

    public String getBarcode() {
        return barcode;
    }

    public String toString() {
        return barcode + " " + nettoPrice + " " + vatPercent;
    } // generált string reprezentáció
}
