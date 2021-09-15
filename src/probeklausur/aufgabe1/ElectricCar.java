package probeklausur.aufgabe1;

public class ElectricCar extends AbstractTechnicalDevice{

    private int range;

    public ElectricCar(String name, double voltage, double electricity, int lifeSpan, int range) {
        super(name, voltage, electricity, lifeSpan);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "range=" + range +
                '}';
    }

    @Override
    public double getValue() {
        return getRange() * 10;
    }

    @Override
    public double agingFactor() {
        return super.agingFactor() + super.agingFactor() * 0.1;
    }
}
