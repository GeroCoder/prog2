package probeklausur.aufgabe1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Sculpture sculpture = new Sculpture("Sculpture 1",new Date(1998,12,15),"Jemand", 99.31,2.8);
        Computer computer = new Computer("HP",25,24,10,354);
        ElectricCar electricCar = new ElectricCar("Tesla", 243,231,56,50);
        Painting painting = new Painting("Painting", new Date(1501,7,1),"Leonardo", Painting.ColorType.OIL);


        System.out.println(painting.getColorType());

    }
}
