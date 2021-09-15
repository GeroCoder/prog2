package probeklausur.aufgabe1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Sculpture sculpture = new Sculpture("Sculpture 1",new Date(1998,12,15),"Jemand", 99.31,2.8);
        Computer computer = new Computer("HP",25,24,10,354);
        ElectricCar electricCar = new ElectricCar("Tesla", 243,231,56,50);
        Painting painting = new Painting("Painting", new Date(1501,7,1),"Leonardo", Painting.ColorType.OIL);

        List<AbstractValubleObject> myList = new LinkedList<>();
        myList.add(sculpture);
        myList.add(computer);
        myList.add(electricCar);
        myList.add(painting);

        System.out.println(painting.getColorType());

        try(OutputStream outputStream = new FileOutputStream("C:\\Users\\abdul.alsabbagh\\Documents\\GitHub\\prog2\\src\\probeklausur\\aufgabe1\\testFile.txt")){
            writeEverythingToStream(outputStream, myList);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeEverythingToStream(OutputStream outputStream, List<AbstractValubleObject> list) throws IOException{
        for(AbstractValubleObject a: list){
            if (a instanceof CanWriteToStream){
                ((CanWriteToStream) a).writeToStream(outputStream);
            }
        }
    }
}
