package com.lanjati.Interface;

/**
 * @author Lanang Jati
 */
public class TablePhone implements Telephone {
    private String name;
    private String sound;

    public TablePhone() {
        this.name = "Table Phone";
        this.sound = "Riiiing!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void ring() {
        System.out.println(name + " " + sound);
    }

    @Override
    public void makeCall(String customer) {
        System.out.println("Calling " + customer + " with " + this.name);
    }
}
