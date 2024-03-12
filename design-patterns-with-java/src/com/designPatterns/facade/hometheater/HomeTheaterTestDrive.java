package com.designPatterns.facade.hometheater;

import com.designPatterns.facade.hometheater.devices.*;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        //instantiate components
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();;
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popcornPopper);

        homeTheater.watchMovie("Sisterhood");
        homeTheater.endMovie();
    }
}
