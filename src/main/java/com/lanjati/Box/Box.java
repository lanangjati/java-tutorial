package com.lanjati.Box;

import com.lanjati.Product.Product;

public class Box {
    private String name;
    private int price;
    public final static String STANDARD_SQUARE_BOX = "STANDARD_SQUARE_BOX";
    public final static String CUTE_SQUARE_BOX = "CUTE_SQUARE_BOX";
    public final static String HEART_BOX = "HEART_BOX";

    public Box() {
        this.name = name;
        this.price = price;
    }

    public Box(String name){
        this.name = name;
    }

    public Box(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Box chooseBox(String boxName){
        if(boxName.equalsIgnoreCase(STANDARD_SQUARE_BOX)){
            return new StandardSquareBox();
        }else if(boxName.equalsIgnoreCase(CUTE_SQUARE_BOX)){
            return new CuteSquareBox();
        }else if (boxName.equalsIgnoreCase(HEART_BOX)){
            return new HeartBox();
        }else{
            return new Box("This box is not available in this store");
        }
    }
}
