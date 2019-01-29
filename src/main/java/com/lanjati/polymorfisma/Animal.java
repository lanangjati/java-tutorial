package com.lanjati.polymorfisma;

/**
 * @author Lanang Jati
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public static Animal getInstant(String name) {
        if (name.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (name.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (name.equalsIgnoreCase("chicken")) {
            return new Chicken();
        } else {
            return new Animal("Random animal");
        }
    }

    public String getName() {
        return name;
    }

    public String makeSound() {
        return name + " shout : Groawl!!";
    }
}
