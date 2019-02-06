package com.lanjati.Product;

import com.lanjati.Box.Box;
import com.lanjati.Card.Card;
import com.lanjati.Flower;
import com.lanjati.Flowers.Flowers;
import com.lanjati.WrappingType.Wrapping;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public final static String SINGLE_FLOWER = "SINGLE_FLOWER";
    public final static String BOUQUET = "BOUQUET";
    public final static String BOX = "BOX";

    private String name;
    private int flowerMaxAmount;
    private int wrapperMaxAmount;
    private int maxTypeOfFlower;
    private int maxRibbon;
    private int ribbonEntry;
    private int currentTypeOfFlower;
    private int addditionalCard;
    private List<Flowers> flowersList = new ArrayList<>();
    private List<Wrapping> wrappingList = new ArrayList<>();
    private List<Box> boxList = new ArrayList<>();
    private List<Integer> ribbonList = new ArrayList<Integer>();
    private List<Card> cardList = new ArrayList();


    public Product(String name, int flowerMaxAmount, int wrapperMaxAmount) {
        this.name = name;
        this.flowerMaxAmount = flowerMaxAmount;
        this.wrapperMaxAmount = wrapperMaxAmount;
    }

    public Product(String name, int flowerMaxAmount, int wrapperMaxAmount, int maxTypeOfFlower, int maxRibbon) {
        this.name = name;
        this.flowerMaxAmount = flowerMaxAmount;
        this.wrapperMaxAmount = wrapperMaxAmount;
        this.maxTypeOfFlower = maxTypeOfFlower;
        this.maxRibbon = maxRibbon;

    }

    public int getAddditionalCard() {
        return addditionalCard;
    }

    public void setAddditionalCard(int addditionalCard) {
        this.addditionalCard = addditionalCard;
    }

    public int getCurrentTypeOfFlower() {
        return currentTypeOfFlower;
    }

    public void setCurrentTypeOfFlower(int currentTypeOfFlower) {
        this.currentTypeOfFlower = currentTypeOfFlower;
    }

    public int getRibbonEntry() {
        return ribbonEntry;
    }

    public void setRibbonEntry(int ribbonEntry) {
        this.ribbonEntry = ribbonEntry;
    }

    public int getMaxRibbon() {
        return maxRibbon;
    }

    public void setMaxRibbon(int maxRibbon) {
        this.maxRibbon = maxRibbon;
    }

    public String getName() {
        return name;
    }

    public List<Box> getBoxList() {
        return boxList;
    }

    public void setBoxList(List<Box> boxList) {
        this.boxList = boxList;
    }

    public int getMaxTypeOfFlower() {
        return maxTypeOfFlower;
    }

    public void setMaxTypeOfFlower(int maxTypeOfFlower) {
        this.maxTypeOfFlower = maxTypeOfFlower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlowerMaxAmount() {
        return flowerMaxAmount;
    }

    public void setFlowerMaxAmount(int flowerMaxAmount) {
        this.flowerMaxAmount = flowerMaxAmount;
    }

    public int getWrapperMaxAmount() {
        return wrapperMaxAmount;
    }

    public void setWrapperMaxAmount(int wrapperMaxAmount) {
        this.wrapperMaxAmount = wrapperMaxAmount;
    }

    public static Product getInstant(String nameOfProduct){
        if (nameOfProduct.equals(BOUQUET)) {
            return new BouquetFlower();
        } else if (nameOfProduct.equals(SINGLE_FLOWER)){
            return new SingleFlower();
        }else if(nameOfProduct.equals(BOX)) {
            return new BoxFlower();
        }else{
            return null;
        }
    }

    private int getMaxFlower() {
        return flowerMaxAmount;
    }

    private int getMaxWrapper() {
        return 1;
    }

    protected boolean isFlowerTypeOK(String flowerName) {
        return false;
    }

    public boolean canAddBox(){
        return false;
    }

    public boolean isWrappingOK(int wrappingAmount){
        if (wrappingAmount > 1){
            System.out.println("Can't add wrapping amount more than 1");
            return false;
        }else if(wrappingAmount < 1){
            System.out.println("Please enter the correct amount of wrapping");
            return false;
        }else{
            System.out.println("Wrapping OK");
            return true;
        }
    }

    public boolean isCardOK(){
        return false;
    }

    public boolean isRibbonOK(){
        return false;
    }

    public void addRibbon(int ribbonAmount){
        if (isRibbonOK()) {
            if (getRibbonEntry() == getMaxRibbon()) {
                System.out.println("Ribbon is max");
            } else if (getRibbonEntry() + ribbonAmount > getMaxRibbon()) {
                System.out.println("Ribbon is more than maximum");
            }else if(getRibbonEntry() + ribbonAmount == 0){
                System.out.println("Please enter the correct amount of ribbon");
            }else{
                setRibbonEntry(ribbonAmount);
                System.out.println("Ribbon OK");
            }
        }else{
            System.out.println("Ribbon is not available");
        }

    }

    public void addCard (int cardAmount){

        if (isCardOK() && cardAmount > 1){
            System.out.println("Can't add card more than 1 card");
        }else if (isCardOK() && cardAmount == 1){
            Card card = new Card();
            cardList.add(card);
            System.out.println("Card OK");
        }else if (isCardOK() && cardAmount == 0){
            System.out.println("Please enter the correct amount of card");
        }else{
            System.out.println("Card is not available");
        }

    }

    public void addFlower(String flowerName, int amount) {
        int currentFlowerAmount = flowersList.size();

        if (currentFlowerAmount == getMaxFlower()) {
            System.out.println("Flower are full");
        } else if (currentFlowerAmount + amount > getMaxFlower()) {
            System.out.println("Can't add more than " + (getMaxFlower() - currentFlowerAmount) + " flower");
        }else if (currentFlowerAmount + amount == 0) {
            System.out.println("Please enter the correct amount of flower");
        }else {
            for (int i = 0; i < amount; i++) {

                if (isFlowerTypeOK(flowerName)){
                    System.out.println("Flower OK");
                    if (currentTypeOfFlower < getMaxTypeOfFlower()) {
                        if (!isFlowerTypeInList(flowerName)) {
                            currentTypeOfFlower += 1;
                        }

                        Flowers flowers = Flowers.chooseFlower(flowerName);
                        flowersList.add(flowers);

                    }else if (currentTypeOfFlower == getCurrentTypeOfFlower()){
                        if (isFlowerTypeInList(flowerName)){
                            Flowers flowers = Flowers.chooseFlower(flowerName);
                            flowersList.add(flowers);
                        }else{
                            System.out.println("Type of flower reach maximum");
                        }
                    }else{
                        //System.out.println("current type: " + currentTypeOfFlower);
                        System.out.println("Maximum Type of flower is more than expected");
                    }



                }

            }

        }

    }

    public void addWrapper(String wrapperName, int amount){
        if (isWrappingOK(amount)){
            Wrapping wrapping = Wrapping.chooseWrappingType(wrapperName);
            wrappingList.add(wrapping);
        }

    }

    //can addBox only for product type box
    public void addBox(String boxName){
        String productName = getName();
        //System.out.println(productName);
        if (productName.equalsIgnoreCase(SINGLE_FLOWER)){
            System.out.println("Single flower can't use box");
        }else if(productName.equalsIgnoreCase(BOUQUET)){
            System.out.println("Bouquet flower can't use box");
        }else{
            if (canAddBox()){
                Box box = Box.chooseBox(boxName);
                boxList.add(box);
            }
        }
    }

    public int getTotalPrice() {
        int totalCost = 0;

        for (Flowers flowers : flowersList) {
            //System.out.println(flowers.getPrice());
            totalCost += flowers.getPrice();
        }

        for (Wrapping wrapping : wrappingList){
            totalCost += wrapping.getPrice();
        }

        for (Box box: boxList){
            totalCost += box.getPrice();
        }

        for (Card card: cardList){
            totalCost += card.getPrice();
            //System.out.println(card.getPrice());
        }

        if (getRibbonEntry()== 0) {
            return totalCost;
        }else if (getRibbonEntry() > 2){
            System.out.println("Can't enter more than 2 ribbon");
        }else{

            for (int i = 0; i < getRibbonEntry(); i++){
                totalCost += 2;
            }
        }

        return totalCost;

    }

    private boolean isFlowerTypeInList(String flowerName) {
        boolean isExist = false;
        for (Flowers flower : flowersList) {
            isExist = flower.getName().equals(flowerName);
            if (isExist) {
                break;
            }
        }

        return isExist;
    }
}
