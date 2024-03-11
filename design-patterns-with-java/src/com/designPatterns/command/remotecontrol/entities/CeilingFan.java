package com.designPatterns.command.remotecontrol.entities;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location){
        this.location = location;
        this.speed = OFF;
    }

    public void high(){
        this.speed = HIGH;
        //  code to set fan to high
    }

    public void medium(){
        this.speed = MEDIUM;
        //  code to set fan to medium
    }

    public void low(){
        this.speed = LOW;
        //  code to set fan to low
    }

    public void off(){
        this.speed = OFF;
        //  code to turn fan off
    }

    public int getSpeed(){
        return this.speed;
    }

}
