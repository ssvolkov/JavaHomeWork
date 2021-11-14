package com.pb.volkov.hw6;

import java.util.Objects;

public class Dog extends Animal{

    private String noiseDog;
    private String nameDog;

    public String featDog = "Дружелюбный, любит мячики, гавкает.";

    public Dog(String noiseDog, String nameDog, String food, String location) {
        this.noiseDog = noiseDog;
        this.nameDog = nameDog;
        setFood(food);
        setLocation(location);
    }

    public String getNoiseDog() {
        return noiseDog;
    }

    public void setNoiseDog(String noiseDog) {
        this.noiseDog = noiseDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    @Override
    public void makeNoise (){
        System.out.println("Гав-гав! Гав! Гав-гав-гав!");
    }

    @Override
    public void eat() {
        System.out.println("Пёс ест...");
    }

    @Override
    public String toString() {
        return "Dog{" + "noise Dog='" + getNoiseDog() + '\'' + ", name =" + getNameDog() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(noiseDog, dog.noiseDog) && Objects.equals(nameDog, dog.nameDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noiseDog, nameDog);
    }

}