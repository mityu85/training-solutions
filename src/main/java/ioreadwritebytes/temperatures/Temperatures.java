package ioreadwritebytes.temperatures;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double sum = 0;
        for (byte temperature: data) {
            sum += temperature;
        }
        return sum / 365;
    }

    public double getMonthAverage() {
        double sum = 0;
        for (byte temperature: data) {
            sum += temperature;
        }
        return sum / 30;
    }
}
