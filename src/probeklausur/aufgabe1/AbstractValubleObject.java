package probeklausur.aufgabe1;

import java.util.Objects;

public abstract class AbstractValubleObject {

    private String name;

    public AbstractValubleObject(String name) {
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
        return "AbstractValubleObject{" +
                ", name='" + name + '\'' +
                '}';
    }

}
