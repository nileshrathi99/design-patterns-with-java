package com.designPatterns.command.remotecontrol.entities;

public class Light {

    private boolean lightsOn;
    private String location;

    public Light(String location){
        this.location = location;
        this.lightsOn = false;
    }

    public void on(){
        this.lightsOn = true;
        // code to turn light one
    }

    public void off(){
        this.lightsOn = false;
    }

}
