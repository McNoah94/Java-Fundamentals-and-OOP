package com.mammal.project;

public class Mammal{
    public int energy;

    public void mammal(){
        this.energy = 100;
    }

    public int getEnergy(){
        System.out.println(energy);
        return energy;
    }
}