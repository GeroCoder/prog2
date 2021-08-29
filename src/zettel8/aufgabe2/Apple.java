package zettel8.aufgabe2;

import java.util.Objects;

public class Apple extends Fruit{

    private boolean hasWorms;

    public Apple(String name, String form, int fruitCores, boolean isBitter, boolean hasWorms) {
        super(name, form, fruitCores, isBitter);
        this.hasWorms = hasWorms;
    }

    public boolean isHasWorms() {
        return hasWorms;
    }

    public void setHasWorms(boolean hasWorms) {
        this.hasWorms = hasWorms;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Apple{" +
                "hasWorms=" + hasWorms +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return hasWorms == apple.hasWorms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasWorms);
    }
}
