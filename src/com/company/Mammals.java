package com.company;

public class Mammals extends  Animal implements CanFly {

    public Mammals(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public int getID() {
        return super.getID();
    }

    public void CanFly(){

    }






}
