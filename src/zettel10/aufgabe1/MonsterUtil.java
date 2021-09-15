package zettel10.aufgabe1;

import java.io.*;
import java.util.Arrays;

public class MonsterUtil {
    public void writeMonster(FileOutputStream fileName, Monster monster){
        byte[] monsterInByte = null;
        try(fileName; ObjectOutputStream o = new ObjectOutputStream(fileName)){
            o.writeObject(monster);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
