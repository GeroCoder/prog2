package zettel8_solved.aufgabe2;

import java.util.Objects;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private String form;
    private int fruitCores;
    private boolean isBitter;

    public Fruit(String name, String form, int fruitCores, boolean isBitter) {
        this.name = name;
        this.form = form;
        this.fruitCores = fruitCores;
        this.isBitter = isBitter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getFruitCores() {
        return fruitCores;
    }

    public void setFruitCores(int fruitCores) {
        this.fruitCores = fruitCores;
    }

    public boolean isBitter() {
        return isBitter;
    }

    public void setBitter(boolean bitter) {
        isBitter = bitter;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", form='" + form + '\'' +
                ", fruitCores=" + fruitCores +
                ", isBitter=" + isBitter +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return fruitCores == fruit.fruitCores && isBitter == fruit.isBitter && Objects.equals(name, fruit.name) && Objects.equals(form, fruit.form);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, form, fruitCores, isBitter);
    }

    @Override
    public int compareTo(Fruit f) {
        return form.compareTo(f.getForm());
    }
}
