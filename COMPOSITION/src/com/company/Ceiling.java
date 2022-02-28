package com.company;

public class Ceiling {
    private int bulbs;
    private  int height;
    private String paintedColor;

    public Ceiling(int bulbs,int height,String paintedColor) {
        this.bulbs = bulbs;
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public String getPaintedColor() {
        return paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getBulbs() {
        return bulbs;
    }
}
