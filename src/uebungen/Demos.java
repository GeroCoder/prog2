package uebungen;

import java.util.*;

public class Demos {
    public static void main(String[] args) {
        System.out.println("pleae enter a double");
        double x = 0.0;
        try (Scanner scanner = new Scanner(System.in)) {
            x = scanner.nextDouble();
            System.out.println("you entered a " + x);
        } catch (InputMismatchException exception) {
            x = 0.0;
            System.out.println(x);
        }

    }
}
