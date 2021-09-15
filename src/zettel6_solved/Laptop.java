package zettel6_solved;

public class Laptop extends AbstractElectricalDevice{
    private int numberOfThreads;

    public Laptop(String name, double usefulness, boolean isStationary, double electricalConsumption, int numberOfThreads) {
        super(name, usefulness, isStationary, electricalConsumption);
        this.numberOfThreads = numberOfThreads;
    }


    public int getNumberOfThreads() {
        return numberOfThreads;
    }

    public void setNumberOfThreads(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    @Override
    boolean makesHappy() {
        return numberOfThreads > 2 && getElectricalConsumption() <= 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Laptop{" +
                ", numberOfThreads=" + numberOfThreads +
                '}';
    }

}
