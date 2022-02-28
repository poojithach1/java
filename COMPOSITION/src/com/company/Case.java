package com.company;

import java.util.PrimitiveIterator;

public class Case {
    private String model;
    private String manufacture;
    private String  powerSupply;
    private Dimensions dimensions;

    public Case(String model,String manufacture,String powerSupply,Dimensions dimensions) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    public void pressPowerButton() {
        System.out.println("Power button pressed.");
    }



    public String getPowerSupply() {
        return powerSupply;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
