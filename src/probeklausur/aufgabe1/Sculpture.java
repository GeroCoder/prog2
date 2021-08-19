package probeklausur.aufgabe1;

import java.io.OutputStream;
import java.util.Date;

//TODO implement the method writeToStream() correctly

public class Sculpture extends AbstractArt implements CanWriteToStream{

    private double weightInKg;

    private double heightInMeter;

    public Sculpture(String name, Date manufacturingDate, String manufacturer, double weightInKg, double heightInMeter) {
        super(name, manufacturingDate, manufacturer);
        this.weightInKg = weightInKg;
        this.heightInMeter = heightInMeter;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double getHeightInMeter() {
        return heightInMeter;
    }

    public void setHeightInMeter(double heightInMeter) {
        this.heightInMeter = heightInMeter;
    }

    @Override
    public double getValue() {
        return getWeightInKg() * getHeightInMeter();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Sculpture{" +
                "weightInKg=" + weightInKg +
                ", heightInMeter=" + heightInMeter +
                '}';
    }


    @Override
    public void writeToStream(OutputStream outputStream) {

    }
}
