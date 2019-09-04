package com.example.project5;

public class Tour {
    private String info;
    private String openingHours;
    private String fees;
    private int imageAsset;

    public Tour(String info, String openingHours, String fees, int imageAsset) {

        this.info = info;
        this.openingHours = openingHours;
        this.fees = fees;
        this.imageAsset = imageAsset;

    }

    public String getInfo() {
        return this.info;
    }

    public String getOpeningHours() {
        return this.openingHours;
    }

    public String getFees() {
        return this.fees;
    }

    public int getImageAsset() {
        return this.imageAsset;
    }
}
