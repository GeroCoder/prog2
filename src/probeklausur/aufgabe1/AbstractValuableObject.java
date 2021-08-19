package probeklausur.aufgabe1;

public abstract class AbstractValuableObject {
    private String name;

    public AbstractValuableObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getValue();

    @Override
    public String toString() {
        return super.toString() +
                "ValuableObject{" +
                "name='" + name + '\'' +
                '}';
    }
}
