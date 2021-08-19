package probeklausur.aufgabe1;


import java.util.Date;

public abstract class AbstractArt extends AbstractValuableObject{
    private java.util.Date manufacturingDate;
    private String manufacturer;

    public AbstractArt(String name, Date manufacturingDate, String manufacturer) {
        super(name);
        this.manufacturingDate = manufacturingDate;
        this.manufacturer = manufacturer;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AbstractArt{" +
                "manufacturingDate=" + manufacturingDate +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
