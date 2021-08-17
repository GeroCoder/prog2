package zettel6;

public class Chair extends AbstractFurnishing implements CalculatePriceForMovingCompany, CanBeMovedByMovingCompany{
    private int numberOfLegs;

    public Chair(String name, double usefulness, float length, float hight, String material, double weight, int numberOfLegs) {
        super(name, usefulness, length, hight, material, weight);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    boolean makesHappy() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Chair{" +
                "numberOfLegs=" + numberOfLegs +
                '}';
    }

    @Override
    public double getMovingPrice() {
        return getSizeInSquareMeters() * getWeight() / getUsefulness();
    }
}
