package com.pb.volkov.hw7;

public class Atelier {
    public static void main(String[] args) {

        Pants pants = new Pants("чёрные", Size.M, 1300.00);
        Skirt skirt = new Skirt("зелёная", Size.M, 749.00);
        Tie tie = new Tie("красный", Size.L, 350.00);
        Tshirt tshirt = new Tshirt("серая", Size.XXS, 259.00);

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
