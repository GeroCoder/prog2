package zettel8.aufgabe1;

import java.util.Comparator;

public class CheeseComparator implements Comparator<Pizza> {

    @Override
    public int compare(Pizza o1, Pizza o2) {
        return Integer.compare(o1.getAmountOfCheese(), o2.getAmountOfCheese());
    }
}
