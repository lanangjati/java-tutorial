package com.lanjati.Card;

public class Card {
    private String name;
    private int price;

    public Card() {
        this.name = "card";
        this.price = 1;
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
}
