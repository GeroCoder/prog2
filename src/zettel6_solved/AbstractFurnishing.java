package zettel6_solved;

public abstract class AbstractFurnishing extends AbstractUsefulObject{
    private float length;
    private float height;
    private String material;
    private double weight;

    public AbstractFurnishing(String name, double usefulness, float length, float hight, String material, double weight) {
        super(name, usefulness);
        this.length = length;
        this.height = hight;
        this.material = material;
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isUseful(){
        return getUsefulness() > 0;
    }

    public float getSizeInSquareMeters(){
        return length * height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AbstractFurnishing{" +
                "length=" + length +
                ", hight=" + height +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                '}';
    }
}
