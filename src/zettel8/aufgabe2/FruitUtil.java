package zettel8.aufgabe2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitUtil {

    public static Map<String,Integer> computeFruitCoreHistogram(List<Fruit> fruits){
        //Collections.sort(fruits);
        Map<String,Integer> map = new HashMap<>();
        Collections.sort(fruits);
        int oval = 0;
        int round = 0;
        for(Fruit f: fruits){
            if(f.getForm().equals("oval")) {
                oval += f.getFruitCores();
            }
            else {
                round += f.getFruitCores();
            }
        }
        map.put("Oval",oval);
        map.put("round",round);
        return map;
    }

    public static Map<String,Double> computeRelativeFruitCoreHistogram(List<Fruit> fruits){
        Map<String,Double> map = new HashMap<>();
        Collections.sort(fruits);
        for(Fruit f: fruits){
            map.put(f.getForm(), 0.0);
        }
        int oval = 0;
        int round = 0;
        int total = 0;
        for(Fruit f: fruits){
            total += f.getFruitCores();
            if(f.getForm().equals("oval")) {
                oval += f.getFruitCores();
            }
            else {
                round += f.getFruitCores();
            }
        }
        map.put("Oval",(double) oval * 100 / total);
        map.put("Round",(double) round * 100 / total);
        return map;
    }
}
