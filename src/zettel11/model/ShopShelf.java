package zettel11.model;

import java.util.Collections;
import java.util.List;

/**
 * Shelf containing coffee packs.
 * German: Ladentheke
 */
public class ShopShelf {

    /**
     * List of coffee packs on shelf.
     */
    private List<CoffeePack> coffeePacks;

    /**
     * Filter type that has to be bought with coffee pack.
     */
    private CoffeeFilter coffeeFilter;

    /**
     * Constructor constructing a shop shelf with coffee filter and list of coffee packs.
     * @param coffeePacks
     * @param coffeeFilter
     */
    public ShopShelf(List<CoffeePack> coffeePacks, CoffeeFilter coffeeFilter) {
        this.coffeePacks = coffeePacks;
        this.coffeeFilter = coffeeFilter;
    }

    public List<CoffeePack> getCoffeePacks() {
        return Collections.unmodifiableList(coffeePacks);
    }

    public void addCoffeePack(CoffeePack coffeePack) {
        this.coffeePacks.add(coffeePack);
    }

    public CoffeeFilter getCoffeeFilter() {
        return coffeeFilter;
    }

    public void setCoffeeFilter(CoffeeFilter coffeeFilter) {
        this.coffeeFilter = coffeeFilter;
    }

    @Override
    public String toString() {
        return "ShopShelf{" +
                "coffeePacks=" + coffeePacks +
                ", coffeeFilter=" + coffeeFilter +
                '}';
    }
}
