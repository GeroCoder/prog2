package probeklausur.aufgabe1;

public enum ColorType {
    OIL(500),
    ACRYLIC(200),
    WATERCOLOR(20);

    private int cost;

    ColorType(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
