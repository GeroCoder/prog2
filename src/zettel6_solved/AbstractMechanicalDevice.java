package zettel6_solved;

public abstract class AbstractMechanicalDevice extends AbstractDevice{
    private int numberOfGears;
    private long numberOfScrews;

    public AbstractMechanicalDevice(String name, double usefulness, boolean isStationary, int numberOfGears, long numberOfScrews) {
        super(name, usefulness, isStationary);
        this.numberOfGears = numberOfGears;
        this.numberOfScrews = numberOfScrews;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public long getNumberOfScrews() {
        return numberOfScrews;
    }

    public void setNumberOfScrews(long numberOfScrews) {
        this.numberOfScrews = numberOfScrews;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AbstractMechanicalDevice{" +
                "numberOfGears=" + numberOfGears +
                ", numberOfScrews=" + numberOfScrews +
                '}';
    }
}
