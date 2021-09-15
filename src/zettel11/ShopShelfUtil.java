package zettel11;

import zettel11.model.CoffeeBean;
import zettel11.model.CoffeePack;
import zettel11.model.PackagingType;
import zettel11.model.ShopShelf;

import java.awt.desktop.SystemSleepEvent;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShopShelfUtil {
    /**
     * Prints all product names and number of beans of coffee packs in a shop shelf.
     * @param shopShelf a shop shelf
     */
    public static void printCoffeePackInformationForShopShelf(ShopShelf shopShelf) {
        Stream.of(shopShelf).map(x -> x.getCoffeePacks()).flatMap(Collection::stream).
                map(x -> {
                    StringBuilder result = new StringBuilder();
                    result.append(x.getProductName() + " " + x.getNumberOfBeans());
                    return result.toString();
                }).forEach(System.out::println);
    }


    public static void printCoffeePacks(List<ShopShelf> shopShelves) {
        shopShelves.stream().map(x -> x.getCoffeePacks()).forEach(System.out::println);
    }


/*    public static Map<String,CoffeePack> getGroupedCoffeePackagesByName(List<ShopShelf> shopShelves) {
        Map<String, CoffeePack> result = new HashMap<>()
        shopShelves.stream()
    }*/


    public static void printCoffeePacksFrom100To200PaperPackagedBeans(List<ShopShelf> shopShelves) {
        shopShelves.stream().map(x -> x.getCoffeePacks()).
                flatMap(Collection::stream).
                filter(x -> (x.getNumberOfBeans() >= 100) && (x.getNumberOfBeans() <= 200) && x.getPackagingType() == PackagingType.PAPER).
                forEach(System.out::println);
    }

    //TODO ask Jörg
    public static List<ShopShelf> getShopShelvesByPackagingType(ShopShelf[] shopShelves, PackagingType packagingType) {
        return Arrays.stream(shopShelves).filter(x -> !x.getCoffeePacks().
                stream().allMatch(y -> y.getPackagingType().equals(packagingType))).collect(Collectors.toList());
    }


    public static Double getAverageBeansInShopShelf(ShopShelf shopShelf) {
        return Stream.of(shopShelf).map(x -> x.getCoffeePacks()).flatMap(Collection::stream).
                mapToDouble(CoffeePack::getNumberOfBeans).average().orElse(Double.NaN);
    }


/*    public static Set<CoffeeBean> getShopShelvesByPorcelainFilterFromBeanTypeLiberica(Set<ShopShelf> shopShelves) {
        return shopShelves.stream().map(x->x.ge)
    }*/
}
