package uebungen;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("McKinkey Fransen", "Aime Davin", "Shawn Nalley", "Sadie Hersh", "Antone Blavins",
        "Avis Racette", "Wendie Pardue", "Nickole Henriksen", "Jerrell Burgett", "Marguerite Borgeson");

        List<String> outputNames = new ArrayList<>();

        {
            // without streams
            /*for (String name :names){
                name = name.toUpperCase();
                if(!name.contains("A")){
                    outputNames.add(name);
                }
            }

            Collections.sort(outputNames);

            for(String name: outputNames){
                System.out.println(name);
            }*/

            //with streams
            names.stream().map(String::toUpperCase).filter(x -> !x.contains("A")).sorted().forEach(System.out::println);
        }

        System.out.println();

        {
            //alle gerade quadratzahlen bis 1000 summieren
            int sum = 0;
            /*
            for (int i = 1; i <= 100; i++){
                int square = i * i;
                if(square % 2 == 0){
                    sum+=square;
                }
            }
            System.out.println(sum);*/

            sum = IntStream.rangeClosed(1,100).map(x -> x * x).filter(x -> x % 2 == 0).sum();
            System.out.println(sum);
        }
        System.out.println();
        {
            Set<String> namesSet = new HashSet<>();
            namesSet.add("Dave");
            namesSet.add("Alice");
            namesSet.add("Bob");
            namesSet.add("Chrles");

            namesSet.stream().map(x -> "*** " + x + " ***").sorted().forEach(System.out::println);
        }
        System.out.println();

    }
}
