package probeklausur.aufgabe1;

public class ElectricCar extends AbstractTechnicalDevice {

    private int range;

    public ElectricCar(String name, double voltage, double electicity, int lifeSpanInYears, int range) {
        super(name, voltage, electicity, lifeSpanInYears);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public double getValue() {
        return getRange() * 10;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ElectricCar{" +
                "range=" + range +
                '}';
    }

    @Override
    public double agingFactor() {
        return super.agingFactor() * 10 / 100;
    }
}
