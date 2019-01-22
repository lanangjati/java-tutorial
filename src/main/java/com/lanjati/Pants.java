package com.lanjati;

import java.text.ParseException;

/**
 * @author Lanang Jati
 */
public class Pants {
    private String color;
    private int size;
    private int type;

    public Pants(String color, int size, int type) {
        this.color = color;
        this.size = size;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
