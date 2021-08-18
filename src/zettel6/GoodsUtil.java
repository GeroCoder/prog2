package zettel6;

public class GoodsUtil {
    public static double getTotalUsefulness(AbstractUsefulObject[] usefulObjects){
        double usefulness = 0;
        for (AbstractUsefulObject usefulObject : usefulObjects) {
            usefulness += usefulObject.getUsefulness();
        }
        return usefulness;
    }

    public static AbstractUsefulObject getMostUsefulObject(AbstractUsefulObject[] usefulObjects){
        AbstractUsefulObject mostUsefulObject = null;
        if (usefulObjects.length > 0) {
            mostUsefulObject = usefulObjects[0];
            for (int i = 1; i < usefulObjects.length; i++) {
                if (mostUsefulObject.getUsefulness() < usefulObjects[i].getUsefulness()) {
                    mostUsefulObject = usefulObjects[i];
                }
            }
        }
        return mostUsefulObject;
    }

    public static double getTotalMovingCost(AbstractUsefulObject[] usefulObjects){
        double totalMovingPrice = 0;
        for (AbstractUsefulObject usefulObject: usefulObjects){
            if (usefulObject instanceof CanBeMovedByMovingCompany){
                System.out.println(usefulObject);
            }
            if (usefulObject instanceof CalculatePriceForMovingCompany){
                totalMovingPrice += ((CalculatePriceForMovingCompany)usefulObject).getMovingPrice();
            }
        }
        return totalMovingPrice;
    }
    


}
