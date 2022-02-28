package com.company;

public class Wall {
    private String color;
    private int tiles;

    public Wall(String color,int tiles) {
        this.color = color;
        this.tiles = tiles;
    }

    public int getTiles() {
        return tiles;
    }

    public String getColor() {
        return color;
    }
}
