package com.lanjati;

public class Gardener extends Job{
    private Flower favFlower;

    public Gardener(String name, int salary, String tools) {
        super(name, salary, tools);
        favFlower = new Flower("RED", 10l,false);
    }

    @Override
    public void doingJob() {
        super.doingJob();
    }

    @Override
    public void usingTools() {
        super.usingTools();
    }

    public void printFavFlower()
    {
        System.out.println("Flower color: " + favFlower.getColor());
        System.out.println("Petal amount: " + favFlower.getPetalAmount());
    }

    public boolean isFavFlowerBeauty()
    {
        return favFlower.isBeauty();
    }

}
