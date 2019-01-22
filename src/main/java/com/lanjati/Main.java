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
//        Gardener gardener = new Gardener("string",100,"Hammer");
//        gardener.printFavFlower();
//        System.out.println(gardener.isFavFlowerBeauty());


        Armor armor = new Armor();
        Helmet helmet = new Helmet("Yellow", 1, 1, 2);
        armor.setHelmet(helmet);

        System.out.println("Def from helmet " + armor.getHelmet().getDef());
        System.out.println("Pants color : " + armor.getPants().getColor());

        System.out.println("Body armor plate iron type: " + armor.getBodyArmor().getPlate().getTypeIron());
    }
}
