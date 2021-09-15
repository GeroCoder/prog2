package zettel11;

import zettel11.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class AnalyzeAndRewriteUtil {

    /**
     * TODO: Add Javadoc and rewrite method using streams.
     */
    public static boolean method1(String inputString) {
        String lowerCaseInputString = inputString.toLowerCase(Locale.ROOT);
        int positionFirstCharacter = 0;
        int positionLastChar = lowerCaseInputString.length() - 1;
        if(lowerCaseInputString.length() == 0 || lowerCaseInputString.length() == 1) {
            return true;
        }
        while (positionFirstCharacter < positionLastChar) {
            if(lowerCaseInputString.charAt(positionFirstCharacter) != lowerCaseInputString.charAt(positionLastChar)) {
                return false;
            }
            positionFirstCharacter++;
            positionLastChar--;
        }
        return true;
    }

    /**
     * TODO: Add Javadoc and rewrite method using streams.
     */
    public static int method2(int[] array) {
        int number = array[0];
        for(int x = 1; x < array.length; x++) {
            if(array[x] > number) {
                number = array[x];
            }
        }
        return number;
    }

    /**
     * TODO: Add Javadoc and rewrite method using streams.
     */
    public static long method3(ShopShelf[] shopShelves) {
        long amount = 0;
        for(ShopShelf shopShelf : shopShelves) {
            for(CoffeePack coffeePack : shopShelf.getCoffeePacks()) {
                if(coffeePack.getCoffeeBean().getBeanType().equals(BeanType.EXCELSA)) {
                    amount += 1;
                }
            }
        }
        return amount;
    }

    /**
     * TODO: Add Javadoc and rewrite method using streams.
     */
    public static List<CoffeePack> method4(List<ShopShelf> shopShelves, CoffeeFilter coffeeFilter) {
        List<CoffeePack> coffeePacks = new ArrayList<>();
        for(ShopShelf shopShelf : shopShelves) {
            if(shopShelf.getCoffeeFilter() == coffeeFilter) {
                for(CoffeePack coffeePack : shopShelf.getCoffeePacks()) {
                    coffeePacks.add(coffeePack);
                }
            }
        }
        return coffeePacks;
    }
}
