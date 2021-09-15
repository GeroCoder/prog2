package probeklausur.aufgabe1;

import java.util.Date;
import java.util.Objects;

public abstract class AbstractArt extends AbstractValubleObject{

    private Date manufacturingDate;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbstractArt that = (AbstractArt) o;
        return Objects.equals(manufacturingDate, that.manufacturingDate) && Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manufacturingDate, manufacturer);
    }
}
