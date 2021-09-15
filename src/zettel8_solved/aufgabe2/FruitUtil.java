package zettel8_solved.aufgabe2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitUtil {

    public static Map<String,Integer> computeFruitCoreHistogram(List<Fruit> fruits){
        //Collections.sort(fruits);
        Map<String,Integer> map = new HashMap<>();
        Collections.sort(fruits);
        String form = fruits.get(0).getForm();
        int core = fruits.get(0).getFruitCores();
        map.put(form,core);
        for(int i = 1; i < fruits.size(); i++){
            if(fruits.get(i).getForm().equals(fruits.get(i-1).getForm())){
                core += fruits.get(i).getFruitCores();
                map.put(form,core);
            }
            form = fruits.get(i).getForm();
            core = fruits.get(i).getFruitCores();
        }
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
        for(Fruit fruit: fruits){
            total += fruit.getFruitCores();
            if(fruit.getForm().equals("oval")) {
                oval += fruit.getFruitCores();
            }
            else {
                round += fruit.getFruitCores();
            }
        }
        map.put("Oval",(double) oval * 100 / total);
        map.put("Round",(double) round * 100 / total);
        return map;
    }
}
