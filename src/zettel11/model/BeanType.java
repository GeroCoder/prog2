package zettel11.model;

/**
 * Type of coffee bean.
 */
public enum BeanType {
    /** Arabica coffee bean */
    ARABICA("Arabica Bean"),
    /** Robusta coffee bean */
    ROBUSTA("Robusta Bean"),
    /** Excelsa coffee bean */
    EXCELSA("Excelsa Bean"),
    /** Liberica coffee bean */
    LIBERICA("Liberica Bean");

    /** Name of Bean Type */
    private String beanName;

    /**
     * Constructor for constructing bean types.
     * @param beanName
     */
    BeanType(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public String toString() {
        return "BeanType{" +
                "beanName='" + beanName + '\'' +
                '}';
    }
}
