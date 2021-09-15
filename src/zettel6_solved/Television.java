package zettel6_solved;

public class Television extends AbstractElectricalDevice{

    private boolean hasAmbilight;
    private boolean isSmart;

    public Television(String name, double usefulness, boolean isStationary, double electricalConsumption, boolean hasAmbilight, boolean isSmart) {
        super(name, usefulness, isStationary, electricalConsumption);
        this.hasAmbilight = hasAmbilight;
        this.isSmart = isSmart;
    }

    public boolean isHasAmbilight() {
        return hasAmbilight;
    }

    public void setHasAmbilight(boolean hasAmbilight) {
        this.hasAmbilight = hasAmbilight;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    boolean makesHappy() {
        return isSmart && hasAmbilight;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Television{" +
                "hasAmbilight=" + hasAmbilight +
                ", isSmart=" + isSmart +
                '}';
    }
}
