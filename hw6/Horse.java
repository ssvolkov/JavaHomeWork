package com.pb.volkov.hw6;

import java.util.Objects;

public class Horse extends Animal{

    private String noiseHorse;
    private String nameHorse;

    public String featHorse = "Быстрый, умный, очень дорогой.";

    public Horse(String noiseHorse, String nameHorse, String food, String location) {
        this.noiseHorse = noiseHorse;
        this.nameHorse = nameHorse;
        setFood(food);
        setLocation(location);
    }

    public String getNoiseHorse() {
        return noiseHorse;
    }

    public void setNoiseHorse(String noiseHorse) {
        this.noiseHorse = noiseHorse;
    }

    public String getNameHorse() {
        return nameHorse;
    }

    public void setNameHorse(String nameHorse) {
        this.nameHorse = nameHorse;
    }

    @Override
    public void makeNoise (){
        System.out.println("Иии-го-го! Фррр!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадка ест...");
    }

    @Override
    public String toString() {
        return "Horse{" + "noise Horse='" + getNoiseHorse() + '\'' + ", name =" + getNameHorse() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(noiseHorse, horse.noiseHorse) && Objects.equals(nameHorse, horse.nameHorse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noiseHorse, nameHorse);
    }
}