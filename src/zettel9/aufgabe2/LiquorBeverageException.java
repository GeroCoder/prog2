package zettel9.aufgabe2;

public class LiquorBeverageException extends Exception {
    private int alter;

    public LiquorBeverageException(int alter){
        super("du bist noch " + alter + "jahre alt!");
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }
}
