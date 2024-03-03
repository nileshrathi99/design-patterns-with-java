package com.designPatterns.observer.youtube;

import com.designPatterns.observer.youtube.publishers.Cokestudio;
import com.designPatterns.observer.youtube.publishers.Neetcode;
import com.designPatterns.observer.youtube.subscribers.GeneralUser;

public class YoutubeStation {

    public static void main(String[] args) {

        Neetcode neetcode = new Neetcode();
        Cokestudio cokestudio = new Cokestudio();

        GeneralUser ram = new GeneralUser("Ram");
        GeneralUser shyam = new GeneralUser("Shyam");
        GeneralUser baburao = new GeneralUser("Baburao");

        neetcode.addSubscriber(ram);
        neetcode.upload(2);
        System.out.println();

        cokestudio.addSubscriber(baburao);
        cokestudio.upload(1);
        System.out.println();

        neetcode.addSubscriber(shyam);
        neetcode.upload(3);
        System.out.println();

        neetcode.removeSubscriber(ram);
        neetcode.addSubscriber(baburao);
        neetcode.upload(2);

        System.out.println();
        cokestudio.upload(1);

    }
}
