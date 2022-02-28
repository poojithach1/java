package com.company;

public class Pc {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Pc(Monitor monitor,Case theCase,Motherboard motherboard) {
        this.monitor = monitor;
        this.theCase = theCase;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
        Program();
    }
    public void Program() {
        motherboard.loadPrograming("windows-10");
    }
    public void drawLogo() {
        monitor.drawPixelsAt(120,40,"blue");
    }

    public Case getTheCase() {
        return theCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
