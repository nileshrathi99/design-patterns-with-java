package com.designPatterns.facade.hometheater.devices;

public class TheaterLights {
    private int intensity;
    private int defaultIntensity = 50;

    public TheaterLights(){
        this.intensity = 0;
    }

    public void dim(int intensity){
        this.intensity = intensity;
    }

    public void on(){
        this.intensity = this.defaultIntensity;
    }
}
