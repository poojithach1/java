package com.company;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("Deluxe", "sausage & Bacon",13.44,"white");
        super.addHamburgerAddition1("chips",11.11);
        super.addHamburgerAddition2("Drink",22.55);
    }
}
