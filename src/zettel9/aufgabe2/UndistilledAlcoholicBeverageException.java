package zettel9.aufgabe2;

public class UndistilledAlcoholicBeverageException extends Exception {
    private int alter;

    public UndistilledAlcoholicBeverageException(int alter) {
        super("du bist noch nicht 16 Jahre alt!");
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }
}
