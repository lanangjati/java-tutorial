package com.lanjati;

/**
 * @author Lanang Jati
 */
public class Armor {
    private Helmet helmet = new Helmet();
    private BodyArmor bodyArmor = new BodyArmor(1, 4);
    private Pants pants = new Pants("Green", 4, 1);

    public Armor() {
    }

    public Armor(Helmet helmet, BodyArmor bodyArmor, Pants pants) {
        this.helmet = helmet;
        this.bodyArmor = bodyArmor;
        this.pants = pants;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public BodyArmor getBodyArmor() {
        return bodyArmor;
    }

    public void setBodyArmor(BodyArmor bodyArmor) {
        this.bodyArmor = bodyArmor;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }
}
