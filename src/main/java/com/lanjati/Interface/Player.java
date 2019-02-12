package com.lanjati.Interface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lanang Jati
 */
public class Player implements Saveable {
    private String name;
    private int str;
    private String weapon;

    public Player(String name, int str) {
        this.name = name;
        this.str = str;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", str=" + str +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String>  save() {
        List<String> values = new ArrayList<>();
        values.add(0, name);
        values.add(1, String.valueOf(str));
        values.add(2, weapon);

        return values;
    }

    @Override
    public void read(List<String> data) {
        this.name = data.get(0);
        this.str = Integer.parseInt(data.get(1));
        this.weapon = data.get(2);
    }
}
