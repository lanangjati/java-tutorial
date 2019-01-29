package com.lanjati.polymorfisma;

/**
 * @author Lanang Jati
 */
public class Cat extends Animal {

    private Dog rival;

    public Cat() {
        super("Cat");
        rival = new Dog();
    }

    @Override
    public String makeSound() {
        return "Cat shout : Miaw!";
    }

    public void bite() {
        System.out.println("Cat bite with fang");
    }

    public Dog getRival() {
        return rival;
    }
}
