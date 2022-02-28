package com.company;

public class Main {
    public static void main(String[] args) {
      Hamburger hamburger = new Hamburger("basic","sausage",333.2,"white");
      double price=hamburger.itemizedHamburger();
      hamburger.addHamburgerAddition1("tomato",2.33);
      hamburger.addHamburgerAddition2("lettuce",5.34);
      hamburger.addHamburgerAddition3("carrot",4.23);
      System.out.println("total price : "+hamburger.itemizedHamburger());

      DeluxeHamburger dh = new DeluxeHamburger();
      dh.addHamburgerAddition1("tomato",22.2);
      System.out.println("total price : "+dh.itemizedHamburger());

      HealthyHamburger healthyBurger = new HealthyHamburger("Egg",12.11);
      healthyBurger.addHealthyAddition2("onions",3.23);
      healthyBurger.addHealthyAddition1("meat",44.3);
      System.out.println("total price : "+healthyBurger.itemizedHamburger());
    }
}
