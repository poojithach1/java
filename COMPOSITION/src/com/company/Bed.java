package com.company;

public class Bed {
    private int pillows;
    private int blankets;
    private String blanketColor;
    private String shape;

    public Bed(int pillows,int blankets,String blanketColor,String shape) {
        this.pillows=pillows;
        this.blanketColor=blanketColor;
        this.blankets=blankets;
        this.shape=shape;
    }

    public String getShape() {
            return shape;
    }

    public int getPillows() {
        return pillows;
    }

    public int getBlankets() {
        return blankets;
    }

    public String getBlanketColor() {
        return blanketColor;
    }
   public void make(){
       System.out.println("bed->making");
   }
}