package probeklausur.aufgabe1;

import java.util.Date;

public class Painting extends AbstractArt{
    public enum ColorType{

        OIL(500),
        ACRYLIC(200),
        WATERCOLOR(20);

        private int cost;

        ColorType(int cost) {
            this.cost = cost;
        }

        public int getCost() {
            return cost;
        }
    }

    private ColorType colorType;

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

    @Override
    public double getValue() {
        return getColorType().getCost() * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Painting{" +
                "colorType=" + colorType +
                '}';
    }
}
