package com.pb.volkov.hw7;

class Tshirt extends Clothes implements ManClothes, WomanClothes {

    String tshirt = "Футболка";

    public Tshirt(String color, Size size, double price) {
        super(color, size, price);
        this.tshirt = tshirt;
    }

    @Override
    public void dressMan() {
        System.out.println(tshirt + " " + getColor() + " " + size + " (" + size.getDescription() + ", EU: "
                + size.getEuroSize() + ")" + ", стоимость: " + getPrice() + " грн.");
    }

    @Override
    public void dressWoman() {
        System.out.println(tshirt + " " + getColor() + " " + size + " (" + size.getDescription() + ", EU: "
                + size.getEuroSize() + ")" + ", стоимость: " + getPrice() + " грн.");
    }

}

class Pants extends Clothes implements ManClothes, WomanClothes {
    String pants = "Штаны";

    public String getPants() {
        return pants;
    }

    public Pants(String color, Size size, double price) {
        super(color, size, price);
        this.pants = pants;
    }

    @Override
    public void dressMan() {
        System.out.println(pants + " " + getColor() + " " + size + " (" + size.getDescription() + ", EU: "
                + size.getEuroSize() + ")" + ", стоимость: " + getPrice() + " грн.");
    }

    @Override
    public void dressWoman() {
        System.out.println(pants + " " + getColor() + " " + size + " (" + size.getDescription() + ", EU: "
                + size.getEuroSize() + ")" + ", стоимость: " + getPrice() + " грн.");
    }

}

class Tie extends Clothes implements ManClothes {
    String tie = "Галстук";

    public Tie(String color, Size size, double price) {
        super(color, size, price);
        this.tie = tie;
    }

    @Override
    public void dressMan() {
        System.out.println(tie + " " + getColor() + " " + size + " (" + size.getDescription() + ", EU: "
                + size.getEuroSize() + ")" + ", стоимость: " + getPrice() + " грн.");
    }

}

class Skirt extends Clothes implements WomanClothes {
    String skirt = "Юбка" ;

    public Skirt(String color, Size size, double price) {
        super(color, size, price);
        this.skirt = skirt;
    }

    @Override
    public void dressWoman() {
        System.out.println( skirt + " " + getColor() + " " + size + " (" + size.getDescription() + ", EU: "
                + size.getEuroSize() + ")" + ", стоимость: " + getPrice() + " грн.");
    }

}