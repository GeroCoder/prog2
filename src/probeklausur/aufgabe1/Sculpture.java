package probeklausur.aufgabe1;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Sculpture extends AbstractArt implements CanWriteToStream{

    private double weight;

    private double height;

    public Sculpture(String name, Date manufacturingDate, String manufacturer, double weight, double height) {
        super(name, manufacturingDate, manufacturer);
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Sculpture{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public double getValue() {
        return getHeight() * getWeight();
    }

    @Override
    public void writeToStream(OutputStream outputStream) throws IOException {
        byte[] byteObject = this.toString().getBytes(StandardCharsets.UTF_8);
        outputStream.write(byteObject);
        outputStream.write(10);
    }
}
