package zettel11.model;

/**
 * Coffee pack.
 * German: Kaffeepackung.
 */
public class CoffeePack {

    /**
     * Number of beans in coffee pack.
     */
    private int numberOfBeans;

    /**
     * Name of the coffee pack.
     */
    private String productName;

    /**
     * Coffee bean in coffee pack.
     */
    private CoffeeBean coffeeBean;

    /**
     * Type of packaging for coffee pack.
     */
    private PackagingType packagingType;

    /**
     * Constructor constructing a pack of coffee.
     * @param numberOfBeans
     * @param productName
     * @param coffeeBean
     * @param packagingType
     */
    public CoffeePack(int numberOfBeans, String productName, CoffeeBean coffeeBean, PackagingType packagingType) {
        this.numberOfBeans = numberOfBeans;
        this.productName = productName;
        this.coffeeBean = coffeeBean;
        this.packagingType = packagingType;
    }

    public int getNumberOfBeans() {
        return numberOfBeans;
    }

    public void setNumberOfBeans(int numberOfBeans) {
        this.numberOfBeans = numberOfBeans;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public CoffeeBean getCoffeeBean() {
        return coffeeBean;
    }

    public void setCoffeeBean(CoffeeBean coffeeBean) {
        this.coffeeBean = coffeeBean;
    }

    public PackagingType getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }

    @Override
    public String toString() {
        return "CoffeePack{" +
                "numberOfBeans=" + numberOfBeans +
                ", productName='" + productName + '\'' +
                ", coffeeBean=" + coffeeBean +
                ", packagingType=" + packagingType +
                '}';
    }
}
