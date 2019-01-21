package com.lanjati;

/**
 * @author Lanang Jati
 */
public class Flower {

    private String color;
    private Long petalAmount;
    private boolean isHasThorn;
    private static final String COLOR= "red,yellow,green";

    public Flower() {
        System.out.println("Empty constructor called");
    }

    public Flower(String color) {
        this(color, 2l, true);
        System.out.println("Constructor color");
    }

    public Flower(String color, Long petalAmount, boolean isHasThorn) {
        this.color = color;
        this.petalAmount = petalAmount;
        this.isHasThorn = isHasThorn;
        System.out.println("Constructor all");

    }

    public boolean isBeauty() {
        if (color.equalsIgnoreCase("red") && petalAmount >= 5){
            return true;
        } else return isHasThorn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (COLOR.contains(color.toLowerCase())) {
            this.color = color;
        } else {
            this.color = "Undefined";
        }
    }

    public Long getPetalAmount() {
        return petalAmount;
    }

    public void setPetalAmount(Long petalAmount) {
        this.petalAmount = petalAmount;
    }

    public boolean isHasThorn() {
        return isHasThorn;
    }

    public void setHasThorn(boolean hasThorn) {
        isHasThorn = hasThorn;
    }
}
