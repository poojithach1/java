package com.company;

public class Motherboard {
    private String modal;
    private String manufacture;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard( String modal,String manufacture,int ramSlots,int cardSlots, String bios) {
        this.modal = modal;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadPrograming(String programName) {
        System.out.println("programName:"+programName+"is now loading...");
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getModal() {
        return modal;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getBios() {
        return bios;
    }
}
