package com.company;

public class Lamp {
    private String style;
    private int globRating;
    private boolean batter;

    public Lamp(String style, int globRating,boolean batter) {
        this.style = style;
        this.globRating = globRating;
        this.batter = batter;
    }

    public void lightUp() {
        System.out.println("light -> turn on");
    }
    public String getStyle() {
        return style;
    }

    public boolean isBatter() {
        return batter;
    }

    public int getGlobRating() {
        return globRating;
    }
}
