package zettel6;

public class Laptop extends AbstractElectricalDevice{
    private int numberOfCores;
    private int numberOfThreads;

    public Laptop(String name, double usefulness, boolean isStationary, double electricalConsumption, int numberOfCores, int numberOfThreads) {
        super(name, usefulness, isStationary, electricalConsumption);
        this.numberOfCores = numberOfCores;
        this.numberOfThreads = numberOfThreads;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getNumberOfThreads() {
        return numberOfThreads;
    }

    public void setNumberOfThreads(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    @Override
    boolean makesHappy() {
        return numberOfCores > 2 && getElectricalConsumption() <= 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Laptop{" +
                "numberOfCores=" + numberOfCores +
                ", numberOfThreads=" + numberOfThreads +
                '}';
    }

}
