package zettel8.aufgabe2;

import java.util.LinkedList;
import java.util.List;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new LinkedList<>();
        fruits.add(new Apple("Green Apple", "round", 23, true, false));
        fruits.add(new Apple("Red Apple", "oval", 14, true, true));
        fruits.add(new Apple("Green Apple", "round", 87, false, false));
        fruits.add(new Blueberries("Coolberries", "oval", 42, false, 325));
        FruitUtil fruitUtil = new FruitUtil();
        System.out.println(FruitUtil.computeFruitCoreHistogram(fruits));
        for(Fruit f:fruits){
            System.out.println(f);
        }
    }
}
