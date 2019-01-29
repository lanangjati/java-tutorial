package com.lanjati.polymorfisma;

/**
 * @author Lanang Jati
 */
public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    @Override
    public String makeSound() {
        return "Dog bark!";
    }
}
