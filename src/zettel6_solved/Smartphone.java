package zettel6_solved;

public class Smartphone extends AbstractElectricalDevice {
    private boolean hasCapacitiveTouch;

    public Smartphone(String name, double usefulness, boolean isStationary, double electricalConsumption, boolean hasCapacitiveTouch) {
        super(name, usefulness, isStationary, electricalConsumption);
        this.hasCapacitiveTouch = hasCapacitiveTouch;
    }

    public boolean isHasCapacitiveTouch() {
        return hasCapacitiveTouch;
    }

    public void setHasCapacitiveTouch(boolean hasCapacitiveTouch) {
        this.hasCapacitiveTouch = hasCapacitiveTouch;
    }

    @Override
    boolean makesHappy() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Smartphone{" +
                "hasCapacitiveTouch=" + hasCapacitiveTouch +
                '}';
    }
}
