package com.lanjati;

import com.lanjati.Box.Box;
import com.lanjati.Flowers.Flowers;
import com.lanjati.Flowers.PinkRose;
import com.lanjati.Interface.*;
import com.lanjati.Product.Product;
import com.lanjati.WrappingType.Wrapping;
import com.lanjati.polymorfisma.Animal;
import com.lanjati.polymorfisma.Cat;
import com.lanjati.polymorfisma.Dog;

import java.util.Scanner;

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
//
//
//        Armor armor = new Armor();
//        Helmet helmet = new Helmet("Yellow", 1, 1, 2);
//        armor.setHelmet(helmet);
//
//        System.out.println("Def from helmet " + armor.getHelmet().getDef());
//        System.out.println("Pants color : " + armor.getPants().getColor());
//
//        System.out.println("Body armor plate iron type: " + armor.getBodyArmor().getPlate().getTypeIron());

//        Animal animal = Animal.getInstant("chicken");
//        System.out.println(animal.makeSound());
//
//        if (animal instanceof Cat) {
//            ((Cat) animal).bite();
//        }

//        Cat cat = new Cat();
//        System.out.println("Cat rival: " + cat.getRival().makeSound());

//        Flowers flowers = Flowers.getInstant("test");
//        System.out.println(flowers.getName()+" and total price: $" + flowers.totalPrice(1));


//        Product product = Product.getInstant(Product.BOX);
//
//        product.addFlower(Flowers.RED_ROSE,7);
//        product.addFlower(Flowers.WHITE_LILY,2);
//        product.addFlower(Flowers.PINK_LILY,1);
//        //product.addFlower(Flowers.YELLOW_TULIP,1);
//        product.addCard(1);
//        product.addRibbon(1);
//        product.addBox(Box.CUTE_SQUARE_BOX);
//        product.addWrapper(Wrapping.GORGEOUS_WRAPPING, 1);
//
//        System.out.println("CUSTOMER BUY: " + product.getName() + " PRODUCT WITH TOTAL COST: $"+ product.getTotalPrice());

//        TablePhone tablePhone = new TablePhone();
//        tablePhone.makeCall("Supri");
//        tablePhone.ring();

//        MobilePhone mobilePhone = new MobilePhone();
//        mobilePhone.makeCall("jaja");
//        mobilePhone.ring();
//        mobilePhone.sendMsg();

//        callingSomeOne(tablePhone);
//        callingSomeOne(mobilePhone);

//        Telephone telephone = new TablePhone();

        Player john = new Player("John", 30);
        Monster vampire = new Monster("Vampire", 45);
        Database database = new Database();

        database.saveData(vampire);
        System.out.println(vampire.toString());

//        vampire.setWeapon("Axe");
        vampire.setStr(90);
        System.out.println(vampire.toString());

        database.loadData(vampire);
        System.out.println(vampire.toString());

    }

    public static void callingSomeOne(Telephone telephone) {
        telephone.makeCall("Budi");
        telephone.makeCall("Islan");
    }
}
