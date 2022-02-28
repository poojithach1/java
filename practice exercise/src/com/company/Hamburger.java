package com.company;

public class Hamburger {
    private String name;
    private String rollType;
    private double price;
    private String meat;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name,String rollType,double price, String meat) {
        this.name= name;
        this.rollType = rollType;
        this.price = price;
        this.meat = meat;
    }

    public void addHamburgerAddition1(String name,double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name,double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name,double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name,double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizedHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name+" hamburger on a " + this.rollType + " roll with "+this.meat+ ",price is "+this.price);
        if(addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("add"+this.addition1Name +" for an extra "+this.addition1Price);
        }
        if(addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("add " +this.addition2Name+" for an extra "+this.addition2Price);
        }
        if(addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("add " +this.addition3Name+" for an extra "+this.addition3Price);
        }
        if(addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("add " +this.addition4Name+" for an extra "+this.addition4Price);
        }
        return hamburgerPrice;
    }

}
