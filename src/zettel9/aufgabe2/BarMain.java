package zettel9.aufgabe2;

public class BarMain {
    public static void orderDrink(String bevrage, int age) throws LiquorBeverageException, UndistilledAlcoholicBeverageException, UnknownBeverageException{
        if(age < 16 && bevrage.equals("beer")){
            throw new UndistilledAlcoholicBeverageException(age);
        }

        else if(age < 18 && bevrage.equals("vodka")){
            throw new LiquorBeverageException(age);
        }

        else if (!(bevrage.equals("vodka") || bevrage.equals("beer"))){
            throw new UnknownBeverageException(bevrage);
        }
        else {
            System.out.println("bitte schoen! ");
        }
    }

    public static void main(String[] args) {
        try {
            orderDrink("beer", 17);
        }
        catch (LiquorBeverageException ex){
            System.err.println(ex.getMessage());
        }
        catch (UndistilledAlcoholicBeverageException e){
            System.err.println(e.getMessage());
        }
        catch (UnknownBeverageException e){
            System.err.println(e.getMessage());
        }
    }
}
