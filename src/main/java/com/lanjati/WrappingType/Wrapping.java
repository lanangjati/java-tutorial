package com.lanjati.WrappingType;

public class Wrapping {
    public final static String CUTE_WRAPPING = "CUTE_WRAPPING";
    public final static String GORGEOUS_WRAPPING = "GORGEOUS_WRAPPING";
    public final static String STANDARD_WRAPPING = "STANDARD_WRAPPING";
    private String name;
    private int price;

    public Wrapping() {
        this.name = name;
        this.price = price;
    }

    public Wrapping(int price) {
        this.price = price;
    }

    public Wrapping(String name){
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

    public void setPrice(int price) {
        this.price = price;
    }

//    public int totalPrice(int totalWrapping){
//        if (totalWrapping > 1)
//        {
//            price = totalWrapping * price;
//        }else {
//            price = getPrice();
//        }
//
//        return this.price;
//    }

    public static Wrapping chooseWrappingType(String name){
        if (name.equalsIgnoreCase(CUTE_WRAPPING)){
            return new CuteWrapping();
        }else if(name.equalsIgnoreCase(STANDARD_WRAPPING)){
            return new StandardWrapping();
        }else if(name.equalsIgnoreCase(GORGEOUS_WRAPPING)){
            return new GorgeousWrapping();
        }else{
            return new Wrapping("Wrapping type is not available in this store");
        }
    }
}
