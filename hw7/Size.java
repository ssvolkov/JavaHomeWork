package com.pb.volkov.hw7;

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