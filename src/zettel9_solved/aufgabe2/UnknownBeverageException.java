package zettel9_solved.aufgabe2;

public class UnknownBeverageException extends Exception {
    private String bevrage;

    public UnknownBeverageException(String bevrage) {
        super(bevrage + " is not known in this bar!");
        this.bevrage = bevrage;
    }

    public String getBevrage() {
        return bevrage;
    }
}
