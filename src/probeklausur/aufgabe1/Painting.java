package probeklausur.aufgabe1;

import java.util.Date;

public class Painting extends AbstractArt {

    private ColorType colorType;
    private int cost;

    public Painting(String name, Date manufacturingDate, String manufacturer, ColorType colorType) {
        super(name, manufacturingDate, manufacturer);
        this.colorType = colorType;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public int getCost() {
        return colorType.getCost();
    }

    @Override
    public double getValue() {
        return getCost() * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Painting{" +
                "colorType=" + colorType +
                ", cost=" + cost +
                '}';
    }
}
