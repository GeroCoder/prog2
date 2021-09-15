package zettel10.aufgabe1;

import java.io.*;
import java.util.Arrays;

public class MonsterUtil {
    public static void writeMonster(File fileName, Monster monster)throws IOException{
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream o = new ObjectOutputStream(file);
        o.writeObject(monster);
    }

    public static void readMonster(File filename) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(filename);
        ObjectInputStream o = new ObjectInputStream(inputStream);
        //while (inputStream.read() != -1) {
        Monster m = (Monster) o.readObject();
        System.out.println(m);
        //}
        //inputStream.close();
    }
}
