package com.pb.volkov.hw6;

public class Veterinarian {

    public void treatAnimal(Animal animal){
        System.out.println("Питание для этого животного: " + animal.getFood() + ". Страна животного: " + animal.getLocation());
    }

}