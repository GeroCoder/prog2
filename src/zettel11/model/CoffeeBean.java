package zettel11.model;

/**
 * Coffee Bean.
 */
public class CoffeeBean {

    /**
     * Type of coffee bean.
     */
    private BeanType beanType;

    /**
     * Is bean milled or not?
     * German: Bohne gemahlen wahr/falsch
     */
    private boolean isMilled;

    /**
     * Constructor constructing coffee beans.
     * @param beanType
     * @param isMilled
     */
    public CoffeeBean(BeanType beanType, boolean isMilled) {
        this.beanType = beanType;
        this.isMilled = isMilled;
    }

    public BeanType getBeanType() {
        return beanType;
    }

    public void setBeanType(BeanType beanType) {
        this.beanType = beanType;
    }

    public boolean isMilled() {
        return isMilled;
    }

    public void setMilled(boolean milled) {
        isMilled = milled;
    }

    @Override
    public String toString() {
        return "CoffeeBean{" +
                "beanType=" + beanType +
                ", isMilled=" + isMilled +
                '}';
    }
}
