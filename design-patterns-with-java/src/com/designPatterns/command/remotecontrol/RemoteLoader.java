package com.designPatterns.command.remotecontrol;

import com.designPatterns.command.remotecontrol.commands.CeilingFanHighCommand;
import com.designPatterns.command.remotecontrol.commands.CeilingFanLowCommand;
import com.designPatterns.command.remotecontrol.commands.CeilingFanMediumCommand;
import com.designPatterns.command.remotecontrol.commands.CeilingFanOffCommand;
import com.designPatterns.command.remotecontrol.entities.CeilingFan;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        CeilingFan ceilingFanLivingRoom = new CeilingFan("Living room");
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFanLivingRoom);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFanLivingRoom);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFanLivingRoom);

        remoteControlWithUndo.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(1);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

    }
}
