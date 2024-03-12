package com.designPatterns.facade.hometheater.devices;

public class Amplifier {
    private DvdPlayer dvdPlayer;
    private int volume;

    public Amplifier(){

    }

    public void on(){

    }

    public void off(){

    }

    public void setDvd(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
    }

    public void setSurroundSound(){

    }

    public void setVolume(int volume){
        this.volume = volume;
    }
}
