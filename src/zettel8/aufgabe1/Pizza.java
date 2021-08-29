package zettel8.aufgabe1;

import java.util.List;
import java.util.Objects;

public class Pizza implements Comparable<Pizza>  {
    private int diameter;

    private int amountOfCheese;

    private boolean hasCheeseEdge;

    private List<String> extraToppings;

    private int fatContent;

    public Pizza(int diameter, int amountOfCheese, boolean hasCheeseEdge, List<String> extraToppings, int fatContent) {
        this.diameter = diameter;
        this.amountOfCheese = amountOfCheese;
        this.hasCheeseEdge = hasCheeseEdge;
        this.extraToppings = extraToppings;
        this.fatContent = fatContent;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getAmountOfCheese() {
        return amountOfCheese;
    }

    public void setAmountOfCheese(int amountOfCheese) {
        this.amountOfCheese = amountOfCheese;
    }

    public boolean isHasCheeseEdge() {
        return hasCheeseEdge;
    }

    public void setHasCheeseEdge(boolean hasCheeseEdge) {
        this.hasCheeseEdge = hasCheeseEdge;
    }

    public List<String> getExtraToppings() {
        return extraToppings;
    }

    public void setExtraToppings(List<String> extraToppings) {
        this.extraToppings = extraToppings;
    }

    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "diameter=" + diameter +
                ", amountOfCheese=" + amountOfCheese +
                ", hasCheeseEdge=" + hasCheeseEdge +
                ", extraToppings=" + extraToppings +
                ", fatContent=" + fatContent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return diameter == pizza.diameter && amountOfCheese == pizza.amountOfCheese && hasCheeseEdge == pizza.hasCheeseEdge && fatContent == pizza.fatContent && Objects.equals(extraToppings, pizza.extraToppings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, amountOfCheese, hasCheeseEdge, extraToppings, fatContent);
    }


    @Override
    public int compareTo(Pizza p) {
        return Integer.compare(diameter,p.getDiameter());
    }

}
