package com.pb.volkov.hw7_1;

public class Atelier {

    public enum Size {

        XXS ("Детский размер", 32),
        XS ("Взрослый размер", 34),
        S ("Взрослый размер", 36),
        M ("Взрослый размер", 38),
        L ("Взрослый размер", 40);

        int euroSize;
        String description;

        public int getEuroSize() {
            return euroSize;
        }

        public String getDescription() {
            return description;
        }

        Size (String description, int euroSize) {
            this.description = description;
            this.euroSize = euroSize;
        }

    }

    public interface ManClothes {
        default void dressMan() {
        }

    }

    public interface WomanClothes {
        default void dressWoman() {
        }

    }

    static abstract class Clothes {

        String color;
        Size size;
        double price;

        public Clothes(String color, Size size, double price) {
            this.size = size;
            this.price = price;
            this.color = color;
        }

        public Size getSize() {return size;}
        public void setSize(Size size) {this.size = size;}

        public double getPrice() {return price;}
        public void setPrice(double price) {this.price = price;}

        public String getColor() {return color;}
        public void setColor(String color) {this.color = color;}

    }

    static class Tshirt extends Clothes implements ManClothes, WomanClothes {

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

    static class Pants extends Clothes implements ManClothes, WomanClothes {
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

    static class Tie extends Clothes implements ManClothes {
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

    static class Skirt extends Clothes implements WomanClothes {
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

    public static void main(String[] args) {

        Pants pants = new Pants("чёрные", Size.M, 1399.99);
        Skirt skirt = new Skirt("зелёная", Size.M, 749.99);
        Tie tie = new Tie("красный", Size.L, 359.99);
        Tshirt tshirt = new Tshirt("серая", Size.XXS, 259.99);

        Clothes[] clothes = new Clothes[]{pants, skirt, tie, tshirt};
        dressMan(clothes);
        dressWoman(clothes);
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes clothing: clothes) {
            if (clothing instanceof ManClothes) {
                ManClothes manClothes = (ManClothes) clothing;
                manClothes.dressMan();
            }
        }
    }

    public static void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothing: clothes) {
            if(clothing instanceof WomanClothes) {
                WomanClothes womanClothes = (WomanClothes) clothing;
                womanClothes.dressWoman();
            }
        }
    }

}