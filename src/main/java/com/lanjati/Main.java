package com.lanjati;

/**
 * @author Lanang Jati
 */
public class Main {

    public static void main(String[] args) {
        //System.out.println("In main method");

//        Flower rose = new Flower();
//        rose.setColor("RED");
//        rose.setPetalAmount(10l);
//        rose.isBeauty();

//        Blacksmith blacksmith = new Blacksmith(100, 60);
//        System.out.println("Blacksmith tools is " + blacksmith.getTools());
//        blacksmith.doingJob();
//        blacksmith.createTools();
//        blacksmith.temperingIron();
        Gardener gardener = new Gardener("string",100,"Hammer");
        gardener.printFavFlower();
        System.out.println(gardener.isFavFlowerBeauty());

    }
}
