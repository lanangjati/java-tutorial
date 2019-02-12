package com.lanjati.Interface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lanang Jati
 */
public class Monster implements Saveable {
    private String name;

    private int str;

    public Monster(String name, int str) {
        this.name = name;
        this.str = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", str=" + str +
                '}';
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<>();
        values.add(0, name);
        values.add(1, String.valueOf(str));
        values.add(2, "No weapon");

        return values;
    }

    @Override
    public void read(List<String> data) {
        this.name = data.get(0);
        this.str = Integer.parseInt(data.get(1));
    }
}
