package com.company;

public class Monitor {
    private int size;
    private String model;
    private String manufacture;
    private Resolution nativeResolution;

    public Monitor(String manufacture,int size, String model,Resolution nativeResolution) {
        this.manufacture = manufacture;
        this.size = size;
        this.model = model;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelsAt(int x, int y,String color) {
        System.out.println("draw pixels at "+x+","+y+" in color "+color);
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }
}
