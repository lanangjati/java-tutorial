package com.lanjati.Product;

import com.lanjati.Flowers.Flowers;

public class BoxFlower extends Product{
    public BoxFlower() {
        super(BOX, 15, 1, 4,2);
    }

    public boolean isFlowerTypeOK(String flowerName){
        if (flowerName.equalsIgnoreCase(Flowers.WHITE_DAHLIA) || flowerName.equalsIgnoreCase(Flowers.RED_DAHLIA) || flowerName.equalsIgnoreCase(Flowers.YELLOW_DAHLIA)){
            System.out.println("Dahlia is not available for Box Flower Product");
            return false;
        }

        return true;
    }

    @Override
    public boolean isWrappingOK(int wrappingAmount) {
        return super.isWrappingOK(wrappingAmount);
    }

    public boolean isCardOK() {
        return true;
    }

    public boolean canAddBox(){
        return true;
    }

    public boolean isRibbonOK(){
        return true;
    }
}
