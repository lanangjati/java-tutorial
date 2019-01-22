package com.lanjati;

/**
 * @author Lanang Jati
 */
public class Helmet {
    private String color;
    private int faceType;
    private int size;
    private int def;

    public Helmet() {
        this.size = 4;
        this.def = 10;
        this.color = "Blue";
    }

    public Helmet(String color, int faceType, int size, int def) {
        this.color = color;
        this.faceType = faceType;
        this.size = size;
        this.def = def;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFaceType() {
        return faceType;
    }

    public void setFaceType(int faceType) {
        this.faceType = faceType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
