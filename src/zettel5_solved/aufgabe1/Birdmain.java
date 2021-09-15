package zettel5_solved.aufgabe1;


import zettel5_solved.aufgabe2.BirdReserve;

public class Birdmain {
    public static void main(String[] args) {

        Bird b = new Bird("b", 1, 42, 23, 324, 23);
        Bird b1 = new Bird("b1", 1, 42, 23, 324, 23);
        Bird b2 = new Bird("b2", 1, 42, 23, 324, 23);

        BirdReserve birds = new BirdReserve();

        birds.addBird(b);
        birds.addBird(b1);
        birds.addBird(b2);

        System.out.println(birds);

        birds.removeBird(b);
        System.out.println(birds);
    }
}
