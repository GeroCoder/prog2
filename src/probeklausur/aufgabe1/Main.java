package probeklausur.aufgabe1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(2020/3/4);
        Painting p1 = new Painting("p1",d1,"manufacturer",ColorType.WATERCOLOR);
        System.out.println(p1.getCost());
    }
}
