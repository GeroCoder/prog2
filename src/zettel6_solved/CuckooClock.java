package zettel6_solved;

public class CuckooClock extends AbstractMechanicalDevice implements CanBeMovedByMovingCompany, CalculatePriceForMovingCompany{
    private int timeToTightenUp;

    public CuckooClock(String name, double usefulness, boolean isStationary, int numberOfGears, long numberOfScrews, int timeToTightenUp) {
        super(name, usefulness, isStationary, numberOfGears, numberOfScrews);
        this.timeToTightenUp = timeToTightenUp;
    }

    public int getTimeToTightenUp() {
        return timeToTightenUp;
    }

    public void setTimeToTightenUp(int timeToTightenUp) {
        this.timeToTightenUp = timeToTightenUp;
    }

    @Override
    boolean makesHappy() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CuckooClock{" +
                "timeToTightenUp=" + timeToTightenUp +
                '}';
    }

    @Override
    public double getMovingPrice() {
        return getNumberOfGears();
    }
}
