package com.lanjati;

/**
 * @author Lanang Jati
 */
public class BodyArmor {
    private int def;
    private int size;
    private Plate plate;

    public BodyArmor(int def, int size) {
        this(def, size, new Plate(100));
    }

    public BodyArmor(int def, int size, Plate plate) {
        this.def = def;
        this.size = size;
        this.plate = plate;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }
}
