package com.mammal.project;

public class Gorilla extends Mammal{
    public void Gorilla(){}

    public void throwSomething(){
        energy -= 5;
        System.out.println("Gorilla threw something. Lost 5 energy");
        System.out.println("Energy: " + energy);
    }

    public void eatBananas(){
        energy += 10;
        System.out.println("Ate a banana. Gained 10 energy.");
        System.out.println("Energy: " + energy);
    }

    public void climb(){
        energy -= 10;
        System.out.println("Climbed up the tree. Lost 10 energy.");
        System.out.println("Energy: " + energy);
    }
}