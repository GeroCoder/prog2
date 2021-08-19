package probeklausur.aufgabe1;

public abstract class AbstractTechnicalDevice extends AbstractValuableObject{
    private double voltage;
    private double electicity;
    private int lifeSpanInYears;

    public AbstractTechnicalDevice(String name, double voltage, double electicity, int lifeSpanInYears) {
        super(name);
        this.voltage = voltage;
        this.electicity = electicity;
        this.lifeSpanInYears = lifeSpanInYears;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getElecticity() {
        return electicity;
    }

    public void setElecticity(double electicity) {
        this.electicity = electicity;
    }

    public int getLifeSpanInYears() {
        return lifeSpanInYears;
    }

    public void setLifeSpanInYears(int lifeSpanInYears) {
        this.lifeSpanInYears = lifeSpanInYears;
    }

    public double agingFactor(){
        return getVoltage() * getElecticity();
    }

    @Override
    public String toString() {
        return super.toString() +
                "AbstractTechnicalDevice{" +
                "voltage=" + voltage +
                ", electicity=" + electicity +
                ", lifeSpanInYears=" + lifeSpanInYears +
                '}';
    }
}
