package com.designPatterns.command.remotecontrol;

import com.designPatterns.command.remotecontrol.commands.*;
import com.designPatterns.command.remotecontrol.entities.CeilingFan;
import com.designPatterns.command.remotecontrol.entities.Light;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

//        CeilingFan ceilingFanLivingRoom = new CeilingFan("Living room");
//        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFanLivingRoom);
//        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFanLivingRoom);
//        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFanLivingRoom);
//
//        remoteControlWithUndo.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
//        remoteControlWithUndo.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
//
//        remoteControlWithUndo.onButtonWasPushed(0);
//        remoteControlWithUndo.offButtonWasPushed(0);
//        System.out.println(remoteControlWithUndo);
//        remoteControlWithUndo.undoButtonWasPushed();
//
//        remoteControlWithUndo.onButtonWasPushed(1);
//        System.out.println(remoteControlWithUndo);
//        remoteControlWithUndo.undoButtonWasPushed();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        //Create a Light, and our new undo() enabled Light On and Off Commands.
        remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

    }
}
