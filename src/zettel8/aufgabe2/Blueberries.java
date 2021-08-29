package zettel8.aufgabe2;

import java.util.Objects;

public class Blueberries extends Fruit{

    private int amountInNet;

    public Blueberries(String name, String form, int fruitCores, boolean isBitter, int amountInNet) {
        super(name, form, fruitCores, isBitter);
        this.amountInNet = amountInNet;
    }

    public int getAmountInNet() {
        return amountInNet;
    }

    public void setAmountInNet(int amountInNet) {
        this.amountInNet = amountInNet;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Blueberries{" +
                "amountInNet=" + amountInNet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blueberries that = (Blueberries) o;
        return amountInNet == that.amountInNet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountInNet);
    }
}
