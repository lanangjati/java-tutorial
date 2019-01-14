package com.lanjati;

/**
 * @author Lanang Jati
 */
public class Blacksmith extends Job{

    private int strength;

    public Blacksmith(int salary, int strength) {
        super("Blacksmith", salary, "Hammer");
        this.strength = strength;
    }

    public void temperingIron() {
        System.out.println("Blacksmith.temperingIron() called");
    }

    public void createWeapon() {
        System.out.println("Blacksmith.createWeapon() called");
        usingTools();
        temperingIron();
    }

    public void createTools() {
        System.out.println("Blacksmith.createTools() called");
        super.usingTools();
        temperingIron();
    }

    @Override
    public void doingJob() {
        System.out.println("Blacksmith.doingJob() called");
        createWeapon();
        super.doingJob();
    }

    @Override
    public void usingTools() {
        System.out.println("Blacksmith.usingTools() called  : using " + getTools() + " with strength: " + strength);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
