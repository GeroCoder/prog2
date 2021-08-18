package zettel6;

public abstract class AbstractDevice extends AbstractUsefulObject{
     private boolean isStationary;

    public AbstractDevice(String name, double usefulness, boolean isStationary) {
        super(name, usefulness);
        this.isStationary = isStationary;
    }

    public boolean getStationary() {
        return isStationary;
    }

    public void setStationary(boolean stationary) {
        isStationary = stationary;
    }

    @Override
    public String toString() {
        return "AbstractDevice{" +
                "isStationary=" + isStationary +
                '}';
    }
}
