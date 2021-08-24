package zettel11;

import zettel11.model.CoffeeBean;
import zettel11.model.CoffeePack;
import zettel11.model.PackagingType;
import zettel11.model.ShopShelf;

import java.util.*;

public class ShopShelfUtil {
    /**
     * Prints all product names and number of beans of coffee packs in a shop shelf.
     * @param shopShelf a shop shelf
     */
    public static void printCoffeePackInformationForShopShelf(ShopShelf shopShelf) {
        // TODO: Solution Expected
    }

    /**
     * Prints all coffee packs from a list of shop shelves.
     * @param shopShelves list of shop shelves
     */
    public static void printCoffeePacks(List<ShopShelf> shopShelves) {
        // TODO: Solution Expected
    }

    /**
     * Returns map of coffee packs grouped by the name of the type of coffee beans.
     * @param shopShelves list of shop shelves
     * @return map of coffee packs as described above
     */
    public static Map<String,CoffeePack> getGroupedCoffeePackagesByName(List<ShopShelf> shopShelves) {
        // TODO: Solution Expected
        Map<String,CoffeePack> coffepack = new HashMap<>();
        return coffepack;
    }

    /**
     * Prints all coffee packs that have between 100 and 200 beans and are packaged in paper packaging.
     * @param shopShelves list of shop shelves
     */
    public static void printCoffeePacksFrom100To200PaperPackagedBeans(List<ShopShelf> shopShelves) {
        // TODO: Solution Expected
    }

    /**
     * Returns a new list of shop shelves containing only packaging types of one specific packaging type.
     * @param shopShelves array of shop shelves
     * @param packagingType packaging type
     * @return list of shop shelves as described above
     */
    public static List<ShopShelf> getShopShelvesByPackagingType(ShopShelf[] shopShelves, PackagingType packagingType) {
        // TODO: Solution Expected
        List<ShopShelf> shopshelf = new ArrayList<>();
        return shopshelf;
    }

    /**
     * Returns average amount of beans in a given shop shelf.
     * @param shopShelf a single shop shelf
     * @return average amount of beans, if shop shelf is empty, 0 is returned.
     */
    public static Double getAverageBeansInShopShelf(ShopShelf shopShelf) {
        // TODO: Solution Expected
        Double averageBeans = 0.0;
        return averageBeans;
    }

    /**
     * Returns a set of coffee beans that need to be bought with a porcelain filter and which are of bean type liberica.
     * @param shopShelves set of shop shelves
     * @return set of coffee beans as described above.
     */
    /*public static Set<CoffeeBean> getShopShelvesByPorcelainFilterFromBeanTypeLiberica(Set<ShopShelf> shopShelves) {
        // TODO: Solution Expected
    }*/
}
