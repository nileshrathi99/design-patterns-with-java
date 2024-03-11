package com.designPatterns.command.remotecontrol.commands;

public class NoCommand implements Command{

    public NoCommand(){}


    @Override
    public void execute() {}

    @Override
    public void undo() {

    }
}
