package com.lanjati;

/**
 * @author Lanang Jati
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("In main method");

        Flower rose = new Flower("YELLOW");

        System.out.println(rose.getColor());
        System.out.println(rose.getPetalAmount());

        if (rose.isBeauty()){
            System.out.println("Flower is beauty");
        }else{
            System.out.println("Flower is not beauty");
        }

    }
}
