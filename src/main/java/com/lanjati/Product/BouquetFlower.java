package com.lanjati.Product;

import com.lanjati.Flowers.Flowers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BouquetFlower extends Product {
    //private String[] typeOfFlower = new String[2];

    public BouquetFlower() {
        super(BOUQUET,10,1,3,1);
    }


    public boolean isFlowerTypeOK(String flowerName){
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
        return false;
    }

    public boolean isRibbonOK (){
        return true;
    }
}
