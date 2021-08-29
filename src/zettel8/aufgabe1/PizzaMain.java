package zettel8.aufgabe1;

import java.util.*;

public class PizzaMain {
    public static void main(String[] args) {
        List<String> extraToppings = new LinkedList<>();
        extraToppings.add("Mais");
        extraToppings.add("oliven");
        extraToppings.add("tunafisch");


        Pizza p1 = new Pizza(4,2,false,extraToppings, 10);
        Pizza p2 = new Pizza(6,1,true,extraToppings, 9);
        Pizza p3 = new Pizza(3,3,false,extraToppings, 7);
        Pizza p4 = new Pizza(10,5,true,extraToppings, 3);
        Pizza p5 = new Pizza(4,1,false,extraToppings, 8);

        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(p1);
        pizzas.add(p2);
        pizzas.add(p3);
        pizzas.add(p4);
        pizzas.add(p5);

        Collections.sort(pizzas);


        for(Pizza p:pizzas){
            System.out.print(p + " Hasch Code: ");
            System.out.println(p.hashCode());
        }

        System.out.println(p1.equals(p2));

        pizzas.sort(new FatComparator());
        System.out.println("nach Chees sortiert");
        for(Pizza p:pizzas) {
            System.out.println(p);
        }
    }
}
