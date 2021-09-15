package zettel6_solved;

public abstract class AbstractUsefulObject {
    private String name;
    private double usefulness;

    abstract boolean makesHappy();

    public AbstractUsefulObject(String name, double usefulness) {
        this.name = name;
        this.usefulness = usefulness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUsefulness() {
        return usefulness;
    }

    public void setUsefulness(double usefulness) {
        this.usefulness = usefulness;
    }

    @Override
    public String toString() {
        return "AbstractUsefulObject{" +
                "name='" + name + '\'' +
                ", usefulness=" + usefulness +
                '}';
    }
}
