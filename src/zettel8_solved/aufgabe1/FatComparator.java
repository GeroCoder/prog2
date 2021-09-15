package zettel8_solved.aufgabe1;

import java.util.Comparator;

public class FatComparator implements Comparator<Pizza> {


    @Override
    public int compare(Pizza o1, Pizza o2) {
        return Integer.compare(o2.getFatContent(), o1.getFatContent());
    }
}
