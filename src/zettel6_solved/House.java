package zettel6_solved;

public class House {

    public static void main(String[] args) {
        Chair chair = new Chair("Stuhl", 10, 15.0f, 25f, "Holz", 3, 4);
        Bed bed = new Bed("Bett", 20, 50,20, "Holz", 30, 70);
        Laptop laptop = new Laptop("HP_Laptop", 100, false, 72, 8);

        AbstractUsefulObject[] arr = {chair,bed,laptop};

        for (AbstractUsefulObject ob: arr){
            System.out.println(ob);
        }
    }
}
