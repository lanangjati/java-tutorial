package com.lanjati.Flowers;

import com.lanjati.Flower;

public class Flowers {
    public final static String BLUE_ROSE = "BLUE_ROSE";
    public final static String PINK_LILY = "PINK_LILY";
    public final static String PINK_ROSE = "PINK_ROSE";
    public final static String PINK_TULIP = "PINK_TULIP";
    public final static String RED_DAHLIA = "RED_DAHLIA";
    public final static String RED_ROSE = "RED_ROSE";
    public final static String RED_TULIP = "RED_TULIP";
    public final static String WHITE_DAHLIA = "WHITE_DAHLIA";
    public final static String WHITE_ROSE = "WHITE_ROSE";
    public final static String WHITE_TULIP = "WHITE_TULIP";
    public final static String YELLOW_DAHLIA = "YELLOW_DAHLIA";
    public final static String YELLOW_TULIP ="YELLOW_TULIP";
    public final static String WHITE_LILY = "WHITE_LILY";

    private int price;
    private String name;
    //private int amount;

    public Flowers() {
        this.price = price;
        this.name = name;
        //this.amount = amount;
    }

    public Flowers(int price) {
        this.price = price;
    }

    public Flowers(String name) {
        this.name = name;
    }

    public Flowers(int price, String name) {
        this.price = price;
        this.name = name;
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

//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public int totalPrice(int totalFlower)
//    {
//        if (totalFlower > 1)
//        {
//            price = totalFlower * price;
//        }else {
//            price = getPrice();
//        }
//
//        return this.price;
//    }

    public static Flowers chooseFlower(String name) {
        if (name.equalsIgnoreCase(RED_ROSE)) {
            return new RedRose();
        }else if (name.equalsIgnoreCase(WHITE_ROSE)){
            return new WhiteRose();
        }else if (name.equalsIgnoreCase(PINK_ROSE)){
            return new PinkRose();
        }else if (name.equalsIgnoreCase(BLUE_ROSE)){
            return new BlueRose();
        }else if (name.equalsIgnoreCase(WHITE_LILY)){
            return new WhiteLily();
        }else if (name.equalsIgnoreCase(PINK_LILY)){
            return new PinkLily();
        }else if (name.equalsIgnoreCase(RED_TULIP)){
            return new RedTulips();
        }else if (name.equalsIgnoreCase(WHITE_TULIP)){
            return new WhiteTulips();
        }else if (name.equalsIgnoreCase(PINK_TULIP)){
            return new PinkTulips();
        }else if (name.equalsIgnoreCase(YELLOW_TULIP)){
            return new YellowTulips();
        }else if (name.equalsIgnoreCase(RED_DAHLIA)){
            return new RedDahlia();
        }else if (name.equalsIgnoreCase(WHITE_DAHLIA)){
            return new WhiteDahlia();
        }else if (name.equalsIgnoreCase(YELLOW_DAHLIA)){
            return new YellowDahlia();
        }else{

            return new Flowers("This flower is not available in this store");
//            Flowers newFlower = new Flowers("This flower is not available in this store")
//            System.out.println(newFlower);
        }
    }
}
