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
        AbstractUsefulObject mostUsefulObject = usefulObjects[0];
        for (int i = 0; i< usefulObjects.length; i++){
            if (usefulObjects[i+1].getUsefulness() > usefulObjects[i]){
                mostUsefulObject = usefulObjects[i+1];
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
            usefulObject.ge
        }
    }
}
