package uebungen;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Demos {
    public static void main(String[] args) {
       /* Path path = Paths.get(System.getProperty("user.home"), "Desktop", "arduino projects", "acc", "acc.ino");
        File myFile = path.toFile();
        System.out.println(myFile.isFile());
        File testFile = new File("C:\\Users\\abdul.alsabbagh\\Documents\\GitHub\\prog2\\src\\uebungen\\testFile.txt");

        readFile(testFile);
    }

    public static void readFile(File file){
        //BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8.name()
        try (InputStream inputStream = new FileInputStream(file)){
            int bytes;
            while ((bytes = inputStream.read()) != -1){
                System.out.print(bytes + " ");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeInFile(File file){
        //BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8.name()));
        try(OutputStream outputStream = new FileOutputStream(file)){
            String str = "und hier ist noch ein Satz";
            outputStream.write(25);
        }
        catch (IOException e){
            e.printStackTrace();
        }*/
    }
}
