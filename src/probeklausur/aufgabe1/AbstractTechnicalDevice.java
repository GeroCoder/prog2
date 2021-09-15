package probeklausur.aufgabe1;

import java.util.Objects;

public abstract class AbstractTechnicalDevice extends AbstractValubleObject{
    private double voltage;

    private double electricity;

    private int lifeSpan;

    public AbstractTechnicalDevice(String name, double voltage, double electricity, int lifeSpan) {
        super(name);
        this.voltage = voltage;
        this.electricity = electricity;
        this.lifeSpan = lifeSpan;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AbstractTechnicalDevice{" +
                "voltage=" + voltage +
                ", electricity=" + electricity +
                ", lifeSpan=" + lifeSpan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbstractTechnicalDevice that = (AbstractTechnicalDevice) o;
        return Double.compare(that.voltage, voltage) == 0 && Double.compare(that.electricity, electricity) == 0 && lifeSpan == that.lifeSpan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), voltage, electricity, lifeSpan);
    }

    public double agingFactor(){
        return getElectricity() * getVoltage();
    }
}
