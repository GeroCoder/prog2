package zettel10.aufgabe1;

import java.io.Serializable;

public class Monster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private int  creepiness;

    private int numberOfTeeth;

    private boolean hasFur;

    public Monster(String name, int creepiness, int numberOfTeeth, boolean hasFur) {
        this.name = name;
        this.creepiness = creepiness;
        this.numberOfTeeth = numberOfTeeth;
        this.hasFur = hasFur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreepiness() {
        return creepiness;
    }

    public void setCreepiness(int creepiness) {
        this.creepiness = creepiness;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", creepiness=" + creepiness +
                ", numberOfTeeth=" + numberOfTeeth +
                ", hasFur=" + hasFur +
                '}';
    }


}
