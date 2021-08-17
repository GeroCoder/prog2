package zettel6;

public abstract class AbstractElectricalDevice extends AbstractDevice {

    private double electricalConsumption;

    public AbstractElectricalDevice(String name, double usefulness, boolean isStationary, double electricalConsumption) {
        super(name, usefulness, isStationary);
        this.electricalConsumption = electricalConsumption;
    }

    public double getElectricalConsumption() {
        return electricalConsumption;
    }

    public void setElectricalConsumption(double electricalConsumption) {
        this.electricalConsumption = electricalConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AbstractElectricalDevice{" +
                "electricalConsumption=" + electricalConsumption +
                '}';
    }
}
