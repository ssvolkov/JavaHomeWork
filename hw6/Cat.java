package com.pb.volkov.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private String noiseCat;
    private String nameCat;

    public String featCat = "Ленивый, много спит, мяукает, ловит мышей.";

    public Cat(String noiseCat, String nameCat, String food, String location) {
        this.noiseCat = noiseCat;
        this.nameCat = nameCat;
        setFood(food);
        setLocation(location);
    }

    public String getNoiseCat() {
        return noiseCat;
    }

    public void setNoiseCat(String noiseCat) {
        this.noiseCat = noiseCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу! Или все-таки мур?");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест...");
    }

    @Override
    public String toString() {
        return "Cat{" + "noise Cat='" + getNoiseCat() + '\'' + ", name =" + getNameCat() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(noiseCat, cat.noiseCat) && Objects.equals(nameCat, cat.nameCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noiseCat, nameCat);
    }
}