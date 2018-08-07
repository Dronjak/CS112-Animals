package com.company;

public abstract class Animal {

    private String name;
    private double weight;
    private boolean isDead;
    private int ID = 1;

    public Animal(String name , double weight) {
        this.name = name;
        this.weight = weight;
        this.isDead = false;
        this.ID++;
    }

    abstract void attact(Animal defending);

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getID() {
        return ID;
    }
}
