package zettel9;

public class UndistilledAlcoholicBeverageException extends Exception {
    private String message;

    public UndistilledAlcoholicBeverageException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }
}
