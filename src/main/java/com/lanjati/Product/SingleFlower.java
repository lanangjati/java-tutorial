package com.lanjati.Product;

import com.lanjati.Flower;
import com.lanjati.Flowers.Flowers;
import com.lanjati.WrappingType.Wrapping;

import java.util.ArrayList;
import java.util.List;

public class SingleFlower extends Product{

    public SingleFlower() {
        super(SINGLE_FLOWER, 1,1,1,0);
    }


    //buat method yang membuat objek baru dan menambahkan barang yang diperlukan -> array list
    //
    public boolean isFlowerTypeOK(String flowerName){
        if (flowerName.equalsIgnoreCase(Flowers.WHITE_LILY) || flowerName.equalsIgnoreCase(Flowers.PINK_LILY)){
            System.out.println("Lily is not available for Single Flower Product");
            return false;
        }else if(flowerName.equalsIgnoreCase(Flowers.YELLOW_DAHLIA) || flowerName.equalsIgnoreCase(Flowers.WHITE_DAHLIA) || flowerName.equalsIgnoreCase(Flowers.RED_DAHLIA)){
            System.out.println("Dahlia is not available for Single Flower Product");
            return false;
        }else{
            return true;
        }

    }

    @Override
    public boolean isWrappingOK(int wrappingAmount) {
        return super.isWrappingOK(wrappingAmount);
    }


    public boolean isCardOK() {
        //System.out.println("Single Flower can't add card");
        return false;
    }

    public boolean canAddBox(){
        //System.out.println("Single Flower can't add box");
        return false;
    }

    public boolean isRibbonOk(){
        //System.out.println("Single Flower can't add ribbon");
        return false;
    }

}
