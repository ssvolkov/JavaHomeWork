package com.pb.volkov.hw7;

public abstract class Clothes {

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