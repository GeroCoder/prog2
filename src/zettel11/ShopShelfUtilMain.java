package zettel11;

import zettel11.model.*;

import java.util.LinkedList;
import java.util.List;


public class ShopShelfUtilMain {
    public static void main(String[] args) {
        // TODO: Solution Expected

        List<CoffeePack> coffeePacks1 = new LinkedList<>();
        coffeePacks1.add(new CoffeePack(10,"Aldi", new CoffeeBean(BeanType.ARABICA, true), PackagingType.PAPER));
        coffeePacks1.add(new CoffeePack(20,"Lidle", new CoffeeBean(BeanType.EXCELSA, false), PackagingType.LOOSE));
        coffeePacks1.add(new CoffeePack(20,"Edika", new CoffeeBean(BeanType.LIBERICA, false), PackagingType.PLASTIC));
        coffeePacks1.add(new CoffeePack(30,"Aldi", new CoffeeBean(BeanType.ARABICA, true), PackagingType.PAPER));

        ShopShelf shopShelf1 = new ShopShelf(coffeePacks1,CoffeeFilter.COTTON);
        ShopShelf shopShelf2 = new ShopShelf(coffeePacks1,CoffeeFilter.COPPER);
        ShopShelf shopShelf3 = new ShopShelf(coffeePacks1,CoffeeFilter.PORCELAIN);
        ShopShelf shopShelf4 = new ShopShelf(coffeePacks1,CoffeeFilter.HAND);

        List<ShopShelf> shopShelves = new LinkedList<>();
        shopShelves.add(shopShelf1);
       /* shopShelves.add(shopShelf2);
        shopShelves.add(shopShelf3);
        shopShelves.add(shopShelf4);*/

        ShopShelf[] shopShelvesArray = {shopShelf1};

        //ShopShelfUtil.printCoffeePackInformationForShopShelf(shopShelf1);
        //ShopShelfUtil.printCoffeePacks(shopShelves);
        System.out.println(ShopShelfUtil.getAverageBeansInShopShelf(shopShelf1));
    }
}
