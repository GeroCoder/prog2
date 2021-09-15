package zettel6_solved;

public class Closet extends AbstractFurnishing implements CalculatePriceForMovingCompany, CanBeMovedByMovingCompany{

    public Closet(String name, double usefulness, float length, float hight, String material, double weight) {
        super(name, usefulness, length, hight, material, weight);
    }

    @Override
    public double getWeight() {
        return super.getWeight() * 2;
    }

    @Override
    boolean makesHappy() {
        return isUseful();
    }


    @Override
    public double getMovingPrice() {
        return getSizeInSquareMeters() * getWeight() / getUsefulness();
    }

}
