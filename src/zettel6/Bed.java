package zettel6;

public class Bed extends AbstractFurnishing implements CalculatePriceForMovingCompany, CanBeMovedByMovingCompany{
    private int fluffiness;

    public Bed(String name, double usefulness, float length, float hight, String material, double weight, int fluffiness) {
        super(name, usefulness, length, hight, material, weight);
        this.fluffiness = fluffiness;
    }

    public int getFluffiness() {
        return fluffiness;
    }

    public void setFluffiness(int fluffiness) {
        this.fluffiness = fluffiness;
    }

    @Override
    boolean makesHappy() {
        return fluffiness > 9000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Bed{" +
                "fluffiness=" + fluffiness +
                '}';
    }

    @Override
    public double getMovingPrice() {
        return getSizeInSquareMeters() * getWeight() / getUsefulness();
    }
}
