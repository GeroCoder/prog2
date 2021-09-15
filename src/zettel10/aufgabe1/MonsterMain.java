package zettel10.aufgabe1;

import java.io.*;
import java.nio.file.Path;


public class MonsterMain {

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
            readMonster(file);
        }

        catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }
}
