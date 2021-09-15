package zettel10.aufgabe1;

import java.io.*;
import java.nio.file.Path;


public class MonsterMain {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\abdul.alsabbagh\\Documents\\GitHub\\prog2\\src\\zettel10\\aufgabe1\\monsters.txt";
        String fileName1 = "C:\\Users\\abdul.alsabbagh\\Documents\\GitHub\\prog2\\src\\zettel10\\aufgabe1\\monsters1.txt";

        File file = new File(fileName);
        File file1 = new File(fileName1);

        Monster m1 = new Monster("dragon", 15,200,false);
        Monster m2 = new Monster("deamon", 88,30,false);

/*        try(FileOutputStream file = new FileOutputStream(fileName1)){
            writeMonster(fileName1,m1);
        }

        catch (IOException ex){
            ex.printStackTrace();
        }*/

        try{
            MonsterUtil.readMonster(file);
        }

        catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }
}
