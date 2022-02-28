package com.company;

public class HealthyHamburger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyHamburger(String name, double price) {
        super(name, "brown red", price, "healthy");
    }
    public void addHealthyAddition1(String name,double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public  void addHealthyAddition2 (String name,double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if(healthyExtra1Name != null) {
            hamburgerPrice +=this.healthyExtra1Price;
            System.out.println("added "+this.healthyExtra1Name +"for extra price is "+this.healthyExtra1Price);
        }
        if(healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("added "+this.healthyExtra2Name+" for extra  price is "+this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
