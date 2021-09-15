package zettel5_solved.aufgabe2;

import zettel5_solved.aufgabe1.Bird;

import java.util.LinkedList;

public class BirdReserve {
    private LinkedList<Bird> bs;

    public BirdReserve() {
        this.bs = new LinkedList<>();
    }

    public void addBird(Bird bird){
        bs.add(bird);
    }

    public void removeBird(Bird bird){
        bs.remove(bird);
    }

    @Override
    public String toString() {
        return "BirdReserve{" +
                "birds=" + bs +
                '}';
    }

    public int numberOfSuperRareBirds(BirdReserve birds){
        int numberOfBirds = 0;
        for (Bird b : bs) {
            if (b.kindOfRarity().equals("außergewöhnlich-selten")) numberOfBirds++;
        }
        return numberOfBirds;
    }
    public int averageEstimatedAge(BirdReserve birds){
        int numberOfBirds = 0;
        for (Bird b : bs) {
            numberOfBirds += b.getEstimatedAge();
        }
        return numberOfBirds / bs.size();
    }
}
