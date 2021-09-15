package zettel6_solved;

public class AnalogScale extends AbstractDevice{

    public AnalogScale(String name, double usefulness, boolean isStationary) {
        super(name, usefulness, isStationary);
    }

    @Override
    boolean makesHappy() {
        return (getUsefulness() > 0 && !getStationary());
    }


}
